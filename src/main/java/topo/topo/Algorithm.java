package topo.topo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.entity.Direct;
import com.entity.Edge;
import com.entity.IfIndirect;
import com.entity.IfPoint;
import com.entity.Indirect;
import com.entity.IndirectLibrary;
import com.entity.IndirectReliably;
import com.entity.NodeIfIndirect;
import com.entity.Point;
import com.entity.PointLibrary;
import com.entity.PointReliably;
import com.entity.Topo;
import com.pojo.Interface;
import com.pojo.Node;

import topo.utils.LoadData;
import topo.utils.TopoUtils;

public class Algorithm {
	private static Logger log = Logger.getLogger(Algorithm.class);
	private final static TopoUtils topoUtils = new TopoUtils();
	/**
	 * 计算间接线路 间接连接判断定理1、2、4
	 * @param nodes
	 * @param interfaces
	 * @param points
	 * @param indirects
	 * @return
	 */
	public void calculateIndirect(List<Node> nodes, List<Interface> interfaces, PointLibrary points, IndirectLibrary indirects) {
		List<Point> exclusivePoints = getPointsByReliably(points);
		List<Node> srcNodes = getSrcNodes(points);
		// 间接连接判断定理1、2、4
		for(Node srcNode : srcNodes) {
			List<Point> srcPoints = getPointsBySrcNode(srcNode, points);
			for(Point point : srcPoints) {
				Node destNode = point.getDestNode();
				log.info("Point: " + topoUtils.logPrintObject(point));
				if(destNode.getNodeId()==0) {
					log.info("目标节点不存在，放弃");
					continue;
				}
				if(destNode.getIsrouter()==0 || destNode.getIsswitch()==0) {
					log.info("目标节点非网络设备，放弃");
					continue;
				}
				if(point.getReliably()==PointReliably.PR_DirectExclusive && IsInterfaceExclusive(exclusivePoints, point.getSrcIf())) {
					log.info("与手工线路排他端口冲突，放弃处理此端口");
					continue;
				}
				
				//定理1
				if (point.getReliably() >= PointReliably.PR_Indirect) {
					if (point.getReliably() == PointReliably.PR_DirectExclusive
							|| !IsInterfaceExclusive(exclusivePoints, point.getSrcIf())) {
						setIndirect(indirects, point);
					}
				}
				
				boolean hasIndirect = false;
				
				List<Point> destToSrcPoints = getPointsByBothNode(destNode, srcNode, points);
				//定理2
				if(!destToSrcPoints.isEmpty()) {
					for(Point p : destToSrcPoints) {
						if(IsInterfaceExclusive(exclusivePoints, p.getSrcIf())) {
							setIndirect(indirects, p);
							hasIndirect = true;
							break;		// 不试图通过非可依赖Point判断冗余
						}
					}
				}
				
				if (hasIndirect)
					continue;
				
				// Indirect成立定理4：当前Point指向的目标节点，可以明确的指出目标端口（即MAC地址每端口唯一情况）
				if (point.getReliably() == PointReliably.PR_Point2)
				{
					if (point.getReliably() == PointReliably.PR_DirectExclusive || !IsInterfaceExclusive(exclusivePoints, point.getDestIf()))
					{
						setIndirect(indirects, point);
						log.info("定理4判定存在Indirect：" + topoUtils.logPrintObject(point));
						continue;
					}
				}
				log.debug("无法判定Indirect");
			}
		}
	}
	
	/**
	 * 需要对node_id和if_id进行排序，node_id正序，if_id倒序
	 * @param indirects
	 * @param point
	 */
	private static void setIndirect(IndirectLibrary indirects, Point point) {
		if (point.getSrcNode().getNodeId() > point.getDestNode().getNodeId()
				|| (point.getSrcNode().getNodeId() == point.getDestNode().getNodeId()
						&& point.getSrcIf().getIfId() < point.getDestIf().getIfId())) {
			Indirect indirect = new Indirect();
			indirect.setIf1(point.getDestIf());
			indirect.setIf2(point.getSrcIf());
			indirect.setNode1(point.getDestNode());
			indirect.setNode2(point.getSrcNode());
			indirect.setReliably(PointToIndirectReliably(point.getReliably()));
			indirects.getIndirects().add(indirect);
		} else {
			Indirect indirect = new Indirect();
			indirect.setIf1(point.getSrcIf());
			indirect.setIf2(point.getDestIf());
			indirect.setNode1(point.getSrcNode());
			indirect.setNode2(point.getDestNode());
			indirect.setReliably(PointToIndirectReliably(point.getReliably()));
			indirects.getIndirects().add(indirect);
		}
	}
	
	/**
	 * 根据srcNode和destNode获得他们之间的所有连接关系Point
	 * @param destNode
	 * @param srcNode
	 * @param points
	 * @return
	 */
	private static List<Point> getPointsByBothNode(Node destNode, Node srcNode, PointLibrary points) {
		List<Point> result = new ArrayList<Point>();
		ArrayList<Point> pointList = findNodeIfPoint(srcNode, points);
		if (pointList == null || pointList.isEmpty()) {
			return result;
		}
		for (Point point : pointList) {
			if (point.getDestNode() == destNode) {
				result.add(point);
			}
		}
		return result;
	}
	
	/**
	 * 获取可靠度=PR_DirectExclusive的指向关系
	 * @param points
	 * @return List<Point>
	 */
	private static List<Point> getPointsByReliably(PointLibrary points) {
		List<Point> result = new ArrayList<Point>();
		List<Point> inputPoints = points.getPoints();
		for (Point point : inputPoints) {
			if (point.getReliably() == PointReliably.PR_DirectExclusive) {
				result.add(point);
			}
		}
		return result;
	}

	/**
	 * 获取PointLibrary里的所有原始节点
	 * @param points
	 * @return
	 */
	private static List<Node> getSrcNodes(PointLibrary points) {
		List<Node> result = new ArrayList<Node>();
		for (Node srcNode : points.getNodeIfPoints().keySet()) {
			result.add(srcNode);
		}
		return result;
	}
	
	/**
	 * getPointsBySrcNode
	 * @param srcNode
	 * @param points
	 * @return List<Point>
	 */
	private static List<Point> getPointsBySrcNode(Node srcNode, PointLibrary points) {
		List<Point> result = new ArrayList<Point>();
		ArrayList<Point> pointList = findNodeIfPoint(srcNode, points);
		if (pointList == null || pointList.isEmpty()) {
			log.error("=========> getPointsBySrcNode - findNodeIfPoint return null");
			return result;
		}
		result.addAll(pointList);
		return result;
	}
	
	
	/**
	 * 找到srcNode对应的Point
	 * @param srcNode
	 * @param points
	 * @return
	 */
	private static ArrayList<Point> findNodeIfPoint(Node srcNode, PointLibrary points) {
		for(Node node : points.getNodeIfPoints().keySet()) {
			if(node.nodeEquals(srcNode)){
				return points.getNodeIfPoints().get(node);
			}
		}
		log.error("=========> getPointsBySrcNode - findNodeIfPoint return null");
		return null;
	}

	/**
	 * 去除并不存在的间接线路 直接连接判断定理1、2、3
	 * @param points
	 * @param indirects
	 * @param directs
	 * @throws Exception 
	 */
	public void removeIndirect(PointLibrary points, IndirectLibrary indirects, List<Direct> directs) throws Exception {
		directs.clear();
		List<Indirect> ics = indirects.getIndirects();
		for (Indirect indirect : ics) {
			 log.info("Indirect: " + topoUtils.logPrintObject(indirect));
			// 定理1
			if (indirect.getReliably() == IndirectReliably.IR_Direct) {
				log.info("定律1可信赖判定存在direct");
				setDirect(directs, indirect);
				continue;
			}

			// 定理2 从源节点出发，在indirect组合里面找到所有目标节点设备，设备类型只能为交换机或路由器
			List<Node> nodes1 = getDestNodesDevices(getPointsBySrcIf(points, indirect.getNode1(), indirect.getIf1()));
			List<Node> nodes2 = getDestNodesDevices(getPointsBySrcIf(points, indirect.getNode2(), indirect.getIf2()));
			if (IsNodesIntersection(nodes1, nodes2)) {
				log.info("定理2判定不存在direct");
				continue;
			}

			// 定理3 
			List<Indirect> indirectList = getIndirectByNode(indirects, indirect.getNode1(), indirect.getNode2());
			boolean directFlag = false;
			for (Indirect ind : indirectList) {
				//reliably判断优先级，interface判断是否有公共接口
				if (ind.getReliably() > indirect.getReliably()
						&& (ind.getIf1() == indirect.getIf1() || ind.getIf1() == indirect.getIf2()
								|| ind.getIf2() == indirect.getIf1() || ind.getIf2() == indirect.getIf2())) {
					directFlag = true;
					break;
				}
			}

			if (directFlag) {
				topoUtils.logPrintObject("定理3判定不存在direct");
				continue;
			}
			log.info("过滤定理判定存在direct");
			directs.add(indirect.changeToDirect());
		}
		
		//最后再检查一次拓扑，把目前链路中，链路两端口端口都有多个连接的链路删除
		//删除符合以下条件的线路：线路两端端口都连接了一个以上的设备，这种线路往往是穿透线路，因此可以删除
		List<Direct> multiLinkDirects = new ArrayList<Direct>();
		for(Direct direct : directs) {
			List<Direct> if1Directs = getDirectsByIf(directs, direct.getNode1(), direct.getIf1());
			List<Direct> if2Directs = getDirectsByIf(directs, direct.getNode2(), direct.getIf2());
			if(if1Directs.size()>1 && if2Directs.size()>1) {
				log.info("定律3判定Direct: " + topoUtils.logPrintObject(direct) + "为穿透线路，不成立，删除之");
				multiLinkDirects.add(direct);
			}
		}
		
		//删除操作
		for(Direct direct : multiLinkDirects) {
			directs.remove(direct);
		}
	}
	
	/**
	 * 获取所有即包含node1又包含node2的间接连接
	 * @param indirects
	 * @param node1
	 * @param node2
	 * @return List<Indirect>
	 * @throws Exception 
	 */
	private static List<Indirect> getIndirectByNode(IndirectLibrary indirects, Node node1, Node node2) throws Exception {
		List<Indirect> indirectList = new ArrayList<Indirect>();
		for (NodeIfIndirect nodeIfIndirect : findNodeIfIndirect(indirects.getNodeIfIndirects(), node1)) {
			for (IfIndirect ifIndirect : nodeIfIndirect.getIfIndirects()) {
				for (Indirect indirect : ifIndirect.getIndirects()) {
					if (getRemoteNode(indirect, node1).nodeEquals(node2)) {
						indirectList.add(indirect);
					}
				}
			}
		}
		return indirectList;
	}
	
	/**
	 * 筛选directList里面数据，如果node1和if1在路径里面不存在，则剔除该direct
	 * @param directList
	 * @param node1
	 * @param if1
	 * @return
	 */
	private static List<Direct> getDirectsByIf(List<Direct> directList, Node node1, Interface if1) {
		List<Direct> result = new ArrayList<Direct>();
		for (Direct direct : directList) {
			if (direct.getNode1().nodeEquals(node1) && direct.getIf1().getIfId() == if1.getIfId()) {
				result.add(direct);
			} else if (direct.getNode2().nodeEquals(node1) && direct.getIf2().getIfId() == if1.getIfId()) {
				result.add(direct);
			}
		}
		return result;
	}
	
	/**
	 * 获取结对节点
	 * @param indirect
	 * @param localNode
	 * @return Node
	 * @throws Exception
	 */
	private static Node getRemoteNode(Indirect indirect, Node localNode) throws Exception {
		if (indirect.getNode1().nodeEquals(localNode)) {
			return indirect.getNode2();
		} else if (indirect.getNode2().nodeEquals(localNode)) {
			return indirect.getNode1();
		} else {
			throw new Exception("本地节点必须存在于当前间接连接中");
		}
	}
	
	/**
	 * 获取结对节点
	 * @param edge
	 * @param localNode
	 * @return Node
	 * @throws Exception
	 */
	private static Node getRemoteNode(Edge edge, Node localNode) throws Exception {
		if (edge.getNode1().nodeEquals(localNode)) {
			return edge.getNode2();
		} else if (edge.getNode2().nodeEquals(localNode)) {
			return edge.getNode1();
		} else {
			throw new Exception("本地节点必须存在于当前间接连接中");
		}
	}
	/**
	 * 遍历nodeIfIndirects找到相匹配的Node信息
	 * @param nodeIfIndirects
	 * @param node
	 * @return
	 */
	private static List<NodeIfIndirect> findNodeIfIndirect(List<NodeIfIndirect> nodeIfIndirects, Node node) {
		List<NodeIfIndirect> result = new ArrayList<NodeIfIndirect>();
		for (NodeIfIndirect nodeIfIndirect : nodeIfIndirects) {
			if (nodeIfIndirect.getNode().nodeEquals(node)) {
				result.add(nodeIfIndirect);
			}
		}
		return result;
	}
	
	/**
	 * 判断两个List里面是否有相同的节点
	 * 比对所有跟n1和n2连接的节点，找到交集，判断是否有中间的n3存在，即存在n1-n3和n2-n3两条线路，从而n3变成中间设备
	 * @param nodes1
	 * @param nodes2
	 * @return
	 */
	private boolean IsNodesIntersection(List<Node> nodes1, List<Node> nodes2) {
		for (int i = 0; i < nodes1.size(); i++) {
			for (int j = 0; j < nodes2.size(); j++) {
				if (nodes1.get(i).nodeEquals(nodes2.get(j))) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 从Point获取destNode，筛选得到路由器、交换机类型
	 * @param pointList
	 * @return List<Node>
	 */
	private List<Node> getDestNodesDevices(List<Point> pointList) {
		List<Node> result = new ArrayList<Node>();
		for (Point point : pointList) {
			if (point.getDestNode().getIsrouter() == 1 || point.getDestNode().getIsswitch() == 1) {
				result.add(point.getDestNode());
			}
		}
		return result;
	}
	
	/**
	 * 这是一个封装类，把IfPoint格式转为List<Point>
	 * 实际做的事情是根据srcNode和srcIf去匹配对应的Point，可能有多个Point
	 * @param points
	 * @param srcNode
	 * @param srcIf
	 * @return List<Point>
	 */
	private static List<Point> getPointsBySrcIf(PointLibrary points, Node srcNode, Interface srcIf) {
		IfPoint ifPoint = findIfPoint(points, srcNode, srcIf);
		if(ifPoint== null){
			return new ArrayList<Point>();
		}
		return ifPoint.getPoints();
	}
	/**
	 * 从srcNode匹配所得的pointList里面进行二次匹配，匹配条件为srcIf
	 * @param points
	 * @param srcNode
	 * @param srcIf
	 * @return
	 */
	private static IfPoint findIfPoint(PointLibrary points, Node srcNode, Interface srcIf) {
		ArrayList<Point> pointList = findNodeIfPoint(srcNode, points);
		if (pointList == null || pointList.isEmpty()) {
			return null;
		}
		IfPoint ifPoint = new IfPoint();
		for (Point point : pointList) {
			if (point.getSrcIf().getIfId().equals(srcIf.getIfId())) {
				ifPoint.getPoints().add(point);
			}
		}
		return ifPoint;
	}
	
	/**
	 * 需要对node_id和if_id进行排序，node_id正序，if_id倒序
	 * @param indirects
	 * @param point
	 */
	private static void setDirect(List<Direct> directs, Indirect indirect) {
		Direct direct = new Direct();
		if (indirect.getNode1().getNodeId() > indirect.getNode2().getNodeId()
				|| (indirect.getNode1().getNodeId() == indirect.getNode2().getNodeId()
						&& indirect.getIf1().getIfId() < indirect.getIf2().getIfId())) {
			direct.setIf1(indirect.getIf2());
			direct.setIf2(indirect.getIf1());
			direct.setNode1(indirect.getNode2());
			direct.setNode2(indirect.getNode1());
			directs.add(direct);
		} else {
			direct.setIf1(indirect.getIf1());
			direct.setIf2(indirect.getIf2());
			direct.setNode1(indirect.getNode1());
			direct.setNode2(indirect.getNode2());
			directs.add(direct);
		}
	}
	
	/**
	 * 间接链路剔除算法
	 * @param nodes
	 * @param interfaces
	 * @param points
	 * @param topo
	 * @throws Exception 
	 */
	public void IndirectRemoveTopo(List<Node> nodes, List<Interface> interfaces, PointLibrary points, Topo topo) throws Exception {
		log.info("正在分析生成Indirect数据");
		IndirectLibrary indirects = null;
		calculateIndirect(nodes, interfaces, points, indirects);//定理1、2、4
		log.info("正在分析生成最终数据");
		List<Direct> directs = new ArrayList<Direct>();
		removeIndirect(points, indirects, directs);//定理1、2、3
		//IndirectRemoveTopo计算结果：
		for(Node node :nodes) {
			if(node.getIsrouter()==1 || node.getIsswitch()==1) {
				topo.getNodes().add(node);
			}
		}
		for(Direct direct :directs) {
			Edge edge = new Edge();
			edge.setDirect(direct);
			edge.setNode1(direct.getNode1());
			edge.setNode2(direct.getNode2());
			topo.getEdges().add(edge);
		}
	}
	
	/**
	 * 返回points中的所有叶子端口point
	 * 叶子端口定义：
	 *   1.叶子端口中，包含且仅包含一个目标设备，主机不在判断范围内
	 *   2.叶子端口所在节点还没有与目标设备通过任何方式连接
	 */
	public List<Point> getLeafPoints(List<Interface> interfaces, PointLibrary points, Topo topo) {
		ArrayList<Point> result = new ArrayList<Point>();
		List<Node> srcNodes = getSrcNodes(points);
		Point firstPoint = new Point();
		boolean pointExits = false;
		boolean isAllGoThrough = true;// 是否完全遍历
		for (Node node : srcNodes) {
			List<Interface> ifs = getIfsByNode(interfaces, node);
			for (Interface iter : ifs) {
				List<Point> pointList = getPointsBySrcIf(points, node, iter);
				for (Point point : pointList) {
					if (point.getDestNode().getIsrouter() == 1 || point.getDestNode().getIsswitch() == 1) {
						if (pointExits == false) {
							firstPoint = point;
							pointExits = true;
						} else {
							isAllGoThrough = false;
							break; // 如果存在另一个网络设备，则不是叶子端口
						}
					}
				}
				if (isAllGoThrough && pointExits) {
					result.add(firstPoint);
				}
			}
		}
		return result;
	}
	
	/**
	 * 根据Node_id从interface列表中筛选出对应的接口
	 * @param interfaces
	 * @param node
	 * @return
	 */
	private List<Interface> getIfsByNode(List<Interface> interfaces, Node node) {
		List<Interface> result = new ArrayList<Interface>();
		for (Interface iter : interfaces) {
			if (iter.getNodeId() == node.getNodeId()) {
				result.add(iter);
			}
		}
		return interfaces;
	}

	/**
	 * 遍历拓扑 routeTopo
	 * @param nodes
	 * @param interfaces
	 * @param topo
	 * @param TopoUseFullRouter
	 */
	public void routeTopo(List<Node> nodes, List<Interface> interfaces, Topo topo,boolean TopoUseFullRouter) {
		LoadData loadData = new LoadData();
		List<Point> pointList = loadData.getRoutePoint();
		for(Point point : pointList) {
			//打包封装进topo操作
			Node srcNode = point.getSrcNode();
			Node destNode = point.getDestNode();
			if(!(IsNodeConnect(topo, srcNode, destNode)) || TopoUseFullRouter) {
				Direct direct = new Direct();
				direct.setIf1(point.getSrcIf());
				direct.setIf2(point.getDestIf());
				direct.setNode1(srcNode);
				direct.setNode2(destNode);

				Edge edge = new Edge();
				edge.setNode1(srcNode);
				edge.setNode2(destNode);
				edge.setDirect(direct);
				topo.getEdges().add(edge);
			}
		}
	}
	
	/**
	 * leafConnectTopo
	 * @param nodes
	 * @param interfaces
	 * @param points
	 * @param topo
	 */
	public void leafConnectTopo(List<Node> nodes, List<Interface> interfaces, PointLibrary points, Topo topo) {
		List<Point> leafPoints = getLeafPoints(interfaces, points, topo);// 返回points中的所有叶子端口point
		for (Point point : leafPoints) {
			if (!IsNodeConnect(topo, point.getSrcNode(), point.getDestNode())) {
				// 打包封装进topo操作
				Interface destIf = point.getDestIf();
				if (destIf.getIfId() == 0) {
					destIf = getFirstIfByNode(interfaces, point.getDestNode());
				}
				Direct direct = new Direct();
				direct.setNode1(point.getSrcNode());
				direct.setIf1(point.getSrcIf());
				direct.setNode2(point.getDestNode());
				direct.setIf2(destIf);
				log.info("叶子端口生成Direct：" +
						" If1: " + direct.getIf1() +
						" If2: " + direct.getIf2() +
						" Node1: " + direct.getNode1() +
						" Node2: " + direct.getNode2()
						);
				Edge edge = new Edge();
				edge.setNode1(point.getSrcNode());
				edge.setNode2(point.getDestNode());
				edge.setDirect(direct);
				topo.getEdges().add(edge);
			}
		}
	}
	
	/**
	 * 判断图中两个节点是否存在连接
	 * 广度搜索算法
	 * @param topo
	 * @param node1
	 * @param node2
	 * @return
	 */
	public static boolean IsNodeConnect(Topo topo, Node node1, Node node2) {
		if (!topo.getNodes().contains(node1)) {
			return false;
		}
		if (!topo.getNodes().contains(node2)) {
			return false;
		}
		ArrayList<Node> accessedNodes = new ArrayList<Node>();
		LinkedList<Node> waitNodes = new LinkedList<Node>();
		waitNodes.add(node1);
		while (!waitNodes.isEmpty()) {
			Node currentNode = waitNodes.getFirst();
			waitNodes.removeFirst();
			accessedNodes.add(currentNode);
			List<Edge> edges = getNodeEdges(topo.getEdges(), currentNode);
			for (Edge edge : edges) {
				if (edge.getNode1().nodeEquals(node2) || edge.getNode2().nodeEquals(node2)) {
					return true;
				}
				try {
					if (!accessedNodes.contains(getRemoteNode(edge, currentNode))) {
						waitNodes.addLast(getRemoteNode(edge, currentNode));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}
	
	/**
	 * 获取所有含Node的Edge集合
	 * @param edges
	 * @param node
	 * @return
	 */
	private static List<Edge> getNodeEdges(List<Edge> edges, Node node) {
		List<Edge> results = new ArrayList<Edge>();
		for (Edge edge : edges) {
			if (edge.getNode1().nodeEquals(node) || edge.getNode2().nodeEquals(node)) {
				results.add(edge);
			}
		}
		return results;
	}
	
	/**
	 * 遍历所有interfaces获取destNode对应的Interface
	 * @param interfaces
	 * @param destNode
	 * @return
	 */
	public static Interface getFirstIfByNode(List<Interface> interfaces, Node destNode) {
		for(Interface iter :interfaces) {
			if(iter.getNodeId()==destNode.getNodeId()) {
				return iter;
			}
		}
		log.info("getFirstIfByNode return null");
		return null;
	}
	
	/**
	 * 判断接口ife是否在exclusivePoints所有方向里的接口里面
	 * @param exclusivePoints
	 * @param ife
	 * @return boolean
	 */
	private static boolean IsInterfaceExclusive(List<Point> exclusivePoints, Interface ife) {
		for (Point point : exclusivePoints) {
			if (point.getSrcIf().getIfId() == ife.getIfId() || point.getDestIf().getIfId() == ife.getIfId()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 根据协议可信度来进行优先级判断
	 * @param pointReliably
	 * @return
	 */
	private static int PointToIndirectReliably(int pointReliably) {
		if (pointReliably >= PointReliably.PR_Direct)
			return IndirectReliably.IR_Direct;
		else if (pointReliably == PointReliably.PR_Indirect)
			return IndirectReliably.IR_Indirect1;
		else
			return IndirectReliably.IR_Indirect0;
	}
}
