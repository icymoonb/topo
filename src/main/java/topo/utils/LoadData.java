package topo.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.dao.InterfaceMapper;
import com.dao.NodeMapper;
import com.dao.TopoCommonMapper;
import com.data.ManualPointData;
import com.data.PointData;
import com.data.RoutePointData;
import com.data.SingleAFTPointData;
import com.entity.Point;
import com.entity.PointLibrary;
import com.entity.PointReliably;
import com.entity.StructPoint;
import com.pojo.Interface;
import com.pojo.InterfaceExample;
import com.pojo.Node;
import com.pojo.NodeExample;

import topo.topo.Algorithm;

public class LoadData {
	private static Logger log = Logger.getLogger(Algorithm.class);
	private static SqlSession session = null;
	private static TopoCommonMapper topoCommonMapper = null;
	private static HashMap<Long, Node> nodeMap = new HashMap<Long, Node>();
	private static HashMap<Long, Interface> ifMap = new HashMap<Long, Interface>();
	
	public LoadData() {
		//初始化 把interface和node表加到系统缓存当中
		List<Node> nodeList = new ArrayList<Node>();
		List<Interface> ifList = new ArrayList<Interface>();
		TopoUtils topoUtils = new TopoUtils();
		session = topoUtils.initSession();
    	NodeMapper nodeMapper = session.getMapper(NodeMapper.class);
    	nodeList = nodeMapper.selectByExample(new NodeExample());
    	for(int i=0;i<nodeList.size();i++) {
    		nodeMap.put(nodeList.get(i).getNodeId(), nodeList.get(i));
    	}
    	InterfaceMapper ifMapper = session.getMapper(InterfaceMapper.class);
    	ifList = ifMapper.selectByExample(new InterfaceExample());
    	for(int i=0;i<ifList.size();i++) {
    		ifMap.put(ifList.get(i).getIfId(), ifList.get(i));
    	}
	}
	
	/**
	 * 加载路由信息，读取AFT信息转发表
	 * @return List<Point>
	 */
	public List<Point> getRoutePoint() {
		TopoUtils topoUtils = new TopoUtils();
		session = topoUtils.initSession();
		TopoCommonMapper topoCommonMapper = session.getMapper(TopoCommonMapper.class);
		List<RoutePointData> routePointDatas = topoCommonMapper.getRoutePoint();
		List<Point> pointList = new ArrayList<Point>();
		for(RoutePointData rpd : routePointDatas) {
			Point point = new Point();
			point.setSrcNode(getNodeById(rpd.getSrcNodeId()));
			point.setSrcIf(getInterfaceById(rpd.getSrcIfId()));
			point.setDestNode(getNodeById(rpd.getDestNodeId()));
			point.setDestIf(getInterfaceById(rpd.getDestIfId()));
			point.setReliably(PointReliably.PR_Point);
			pointList.add(point);
		}
		//清理缓存
		nodeMap.clear();
		ifMap.clear();
		return pointList;
		
	}
	
	/**
	 * 根据NodeId获取Node实体
	 * @param nodeId
	 * @return Node
	 */
	private static Node getNodeById(long nodeId) {
		return nodeMap.get(nodeId);
	}
	/**
	 * 根据ifId获取Interface实体
	 * @param ifId
	 * @return Interface
	 */
	private static Interface getInterfaceById(long ifId) {
		return ifMap.get(ifId);
	}
	
	/**
	 * 从数据库装载节点与端口资源
	 * @param nodes
	 * @param interfaces
	 */
	public void loadResource(List<Node> nodes, List<Interface> interfaces) {
		TopoUtils topoUtils = new TopoUtils();
		session = topoUtils.initSession();
    	NodeMapper nodeMapper = session.getMapper(NodeMapper.class);
    	NodeExample nodeExample = new NodeExample();
    	nodes.addAll(nodeMapper.selectByExample(nodeExample));
    	InterfaceMapper interfaceMapper = session.getMapper(InterfaceMapper.class);
    	InterfaceExample interfaceExample = new InterfaceExample();
    	interfaces.addAll(interfaceMapper.selectByExample(interfaceExample));
	}
	
	/**
	 * 加载STP数据
	 * @param nodes
	 * @param interfaces
	 * @param points
	 */
	public void loadSTPPoint(List<Node> nodes, List<Interface> interfaces, PointLibrary points) {
		TopoUtils topoUtils = new TopoUtils();
		session = topoUtils.initSession();
    	topoCommonMapper = session.getMapper(TopoCommonMapper.class);
    	List<RoutePointData> data1 = topoCommonMapper.getFullSTPPoint();
    	List<RoutePointData> data2 = topoCommonMapper.getSingleSTPPoint();
		log.info("得到有用的STP记录" + (data1.size() + data2.size()) + "条");
		for(RoutePointData rpd : data1) {
			StructPoint point = new StructPoint();
			point.setSrcNodeId(rpd.getSrcNodeId());
			point.setSrcIfId(rpd.getSrcIfId());
			point.setDestNodeId(rpd.getDestNodeId());
			point.setDestIfId(rpd.getDestIfId());
			AddPoint(nodes, interfaces, points, point, PointReliably.PR_Direct);
		}
		for(RoutePointData rpd : data2) {
			StructPoint point = new StructPoint();
			point.setSrcNodeId(rpd.getSrcNodeId());
			point.setSrcIfId(rpd.getSrcIfId());
			point.setDestNodeId(rpd.getDestNodeId());
			point.setDestIfId(rpd.getDestIfId());
			AddPoint(nodes, interfaces, points, point, PointReliably.PR_Direct);
		}
	}
	
	/**
	 * 加载CDP数据
	 * @param nodes
	 * @param interfaces
	 * @param points
	 */
	public void loadCDPPoint(List<Node> nodes, List<Interface> interfaces, PointLibrary points) {
		TopoUtils topoUtils = new TopoUtils();
		session = topoUtils.initSession();
    	topoCommonMapper = session.getMapper(TopoCommonMapper.class);
    	List<PointData> data1 = topoCommonMapper.getFullCDPPoint();
    	List<PointData> data2 = topoCommonMapper.getSingleCDPPoint();
    	log.info("得到有用的CDP记录" + (data1.size() + data2.size()) + "条");
		for(PointData pointData : data1) {
			StructPoint point = new StructPoint();
			point.setSrcNodeId(pointData.getSrcNodeId());
			point.setSrcIfId(pointData.getSrcIfId());
			point.setDestNodeId(pointData.getDestNodeId());
			point.setDestIfId(pointData.getDestIfId());
			AddPoint(nodes, interfaces, points, point, PointReliably.PR_Indirect);
		}
		for(PointData pointData : data2) {
			StructPoint point = new StructPoint();
			point.setSrcNodeId(pointData.getSrcNodeId());
			point.setSrcIfId(pointData.getSrcIfId());
			point.setDestNodeId(pointData.getDestNodeId());
			point.setDestIfId(pointData.getDestIfId());
			AddPoint(nodes, interfaces, points, point, PointReliably.PR_Indirect);
		}
	}
	/**
	 * 加载AFT数据
	 * @param nodes
	 * @param interfaces
	 * @param points
	 */
	public void loadAFTPoint(List<Node> nodes, List<Interface> interfaces, PointLibrary points) {
		TopoUtils topoUtils = new TopoUtils();
		session = topoUtils.initSession();
    	topoCommonMapper = session.getMapper(TopoCommonMapper.class);
    	List<SingleAFTPointData> data = topoCommonMapper.getSingleAFTPoint();
    	log.info("得到有用的AFT记录" + data.size() + "条");
    	boolean firstRecord = true;
		for(SingleAFTPointData singleAFTPointData : data) {
			StructPoint point = new StructPoint();
			point.setSrcNodeId(singleAFTPointData.getSrcNodeId());
			point.setSrcIfId(singleAFTPointData.getSrcIfId());
			point.setDestNodeId(singleAFTPointData.getDestNodeId());
			point.setDestIfId(singleAFTPointData.getDestIfId());
			point.setDestMac(singleAFTPointData.getDestMac());
			if(firstRecord) {
				AddPoint(nodes, interfaces, points, point, PointReliably.PR_Point2);
				firstRecord = false;
			} else {
				AddPoint(nodes, interfaces, points, point, PointReliably.PR_Point);
			}
			
		}
	}
	
	/**
	 * 加载手工数据
	 * @param nodes
	 * @param interfaces
	 * @param points
	 */
	public void loadManualPoint(List<Node> nodes, List<Interface> interfaces, PointLibrary points) {
		TopoUtils topoUtils = new TopoUtils();
		session = topoUtils.initSession();
    	topoCommonMapper = session.getMapper(TopoCommonMapper.class);
    	List<ManualPointData> data = topoCommonMapper.getManualPoint();
    	log.info("得到有用的ManualPoint记录" + data.size() + "条");
		for(ManualPointData manualPointData : data) {
			StructPoint point = new StructPoint();
			point.setSrcNodeId(manualPointData.getUplinkNodeId());
			point.setSrcIfId(manualPointData.getUplinkIfId());
			point.setDestNodeId(manualPointData.getNodeId());
			point.setDestIfId(manualPointData.getIfId());
			AddPoint(nodes, interfaces, points, point, PointReliably.PR_DirectExclusive);
		}
	}
	/**
	 * 从CDP，STP，AFT等装载方向数据
	 * @param nodes
	 * @param interfaces
	 * @param points
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public void loadPoint(List<Node> nodes, List<Interface> interfaces, PointLibrary points) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		loadSTPPoint(nodes, interfaces, points);
		log.info("装载STP Points " + points.getPoints().size() + "条");
		loadCDPPoint(nodes, interfaces, points);
		log.info("装载CDP Points " + points.getPoints().size() + "条");
		loadAFTPoint(nodes, interfaces, points);
		log.info("装载AFT Points " + points.getPoints().size() + "条");
		loadManualPoint(nodes, interfaces, points);
		log.info("装载ManualPoint " + points.getPoints().size() + "条");
	}
	
	/**
	 * 封装Point实现类
	 * @param nodes
	 * @param interfaces
	 * @param points
	 * @param point
	 * @return
	 */
	boolean AddPoint(List<Node> nodes, List<Interface> interfaces, PointLibrary points, StructPoint point, int reliably) {
		boolean srcNodeExist = false;
		Node srcNode = new Node();
		for (Node node : nodes) {
			if (point.getSrcNodeId().equals(node.getNodeId())) {
				srcNode = node;
				srcNodeExist = true;
			}
		}
		if (!srcNodeExist) {
			log.info("srcNode is not exist point.getSrcNodeId()=" + point.getSrcNodeId());
			return false;
		}

		boolean srcIfExist = false;
		Interface srcIf = new Interface();
		for (Interface ife : interfaces) {
			if (ife.getIfId().equals(point.getSrcIfId())) {
				srcIf = ife;
				srcIfExist = true;
			}
		}
		if (!srcIfExist) {
			log.info("srcIf is not exist point.getSrcIfId()=" + point.getSrcIfId());
			return false;
		}

		if (point.getDestIfId() > 0) {
			Node destNode = new Node();
			boolean destNodeExist = false;
			for (Node node : nodes) {
				if (point.getDestNodeId().equals(node.getNodeId())) {
					destNode = node;
					destNodeExist = true;
				}
			}
			if (!destNodeExist) {
				log.info("destIf is not exist point.getDestNodeId()=" + point.getDestNodeId());
				return false;
			}
			if (point.getDestIfId() > 0) {
				boolean destIfExist = false;
				for (Interface ife : interfaces) {
					if (ife.getIfId().equals(point.getSrcIfId())) {
						Point p = new Point();
						p.setSrcIf(srcIf);
						p.setSrcNode(srcNode);
						p.setDestIf(ife);
						p.setDestNode(destNode);
						p.setReliably(reliably);
						points.getPoints().add(p);
						if(points.getNodeIfPoints().containsKey(srcNode)) {
							points.getNodeIfPoints().get(srcNode).add(p);
						} else {
							ArrayList<Point> pointList = new ArrayList<Point>();
							pointList.add(p);
							points.getNodeIfPoints().put(srcNode, pointList);
						}
						destIfExist = true;
					}
				}
				if (!destIfExist) {
					log.info("destIf is not exist point.getDestIfId()=" + point.getDestIfId());
					return false;
				}
				return true;
			}
			Point p = new Point();
			p.setSrcIf(srcIf);
			p.setSrcNode(srcNode);
			Interface destIf = new Interface();
			destIf.setIfId(0L);
			p.setDestIf(destIf);
			p.setDestNode(destNode);
			p.setReliably(reliably);
			points.getPoints().add(p);
			if(points.getNodeIfPoints().containsKey(srcNode)) {
				points.getNodeIfPoints().get(srcNode).add(p);
			} else {
				ArrayList<Point> pointList = new ArrayList<Point>();
				pointList.add(p);
				points.getNodeIfPoints().put(srcNode, pointList);
			}
			return true;
		}

		Point p = new Point();
		p.setSrcIf(srcIf);
		p.setSrcNode(srcNode);
		Interface destIf = new Interface();
		destIf.setIfId(0L);
		p.setDestIf(destIf);
		Node destNode = new Node();
		destNode.setNodeId(0L);
		destNode.setBridgeAddress(point.getDestMac().toString());
		p.setDestNode(destNode);
		p.setReliably(reliably);
		points.getPoints().add(p);
		if(points.getNodeIfPoints().containsKey(srcNode)) {
			points.getNodeIfPoints().get(srcNode).add(p);
		} else {
			ArrayList<Point> pointList = new ArrayList<Point>();
			pointList.add(p);
			points.getNodeIfPoints().put(srcNode, pointList);
		}
		return true;
	}
}
