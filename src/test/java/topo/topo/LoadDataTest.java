/**
 * 
 */
package topo.topo;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Point;
import com.entity.PointLibrary;
import com.pojo.Interface;
import com.pojo.Node;

import junit.framework.TestCase;
import topo.utils.LoadData;
import topo.utils.TopoUtils;

/**
 * @author Administrator
 *
 */
public class LoadDataTest extends TestCase {
	final static LoadData loadData = new LoadData();
	final static TopoUtils topoUtils = new TopoUtils();
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test method for {@link topo.utils.LoadData#getRoutePoint()}.
	 */
	public void testGetRoutePoint() {
		List<Point> points = loadData.getRoutePoint();
		System.out.println(points.size());
		System.out.println("SrcIf=======>\n" + topoUtils.logPrintObject(points.get(0).getSrcIf()));
		System.out.println("SrcNode=======>\n" + topoUtils.logPrintObject(points.get(0).getSrcNode()));
		System.out.println("DestIf=======>\n" + topoUtils.logPrintObject(points.get(0).getDestIf()));
		System.out.println("DestNode=======>\n" + topoUtils.logPrintObject(points.get(0).getDestNode()));
	}

	/**
	 * Test method for {@link topo.utils.LoadData#loadResource(java.util.List, java.util.List)}.
	 */
	public void testLoadResource() {
		List<Node> nodes = new ArrayList<Node>();
		List<Interface> interfaces = new ArrayList<Interface>();
		loadData.loadResource(nodes, interfaces);
		System.out.println("nodes.size()=======> " + nodes.size());
		System.out.println("node_id =" + nodes.get(0).getNodeId());
		System.out.println("interfaces.size()=======> " + interfaces.size());
		System.out.println("if_id =" + interfaces.get(0).getIfId());
	}

	/**
	 * Test method for {@link topo.utils.LoadData#loadSTPPoint(java.util.List, java.util.List, com.entity.PointLibrary)}.
	 */
	public void testLoadSTPPoint() {
		List<Node> nodes = new ArrayList<Node>();
		List<Interface> interfaces = new ArrayList<Interface>();
		PointLibrary points = new PointLibrary();
		loadData.loadResource(nodes, interfaces);
		loadData.loadSTPPoint(nodes, interfaces, points);
		System.out.println("points.getPoints().size()=======> " + points.getPoints().size());
		for(int k=0;k<points.getPoints().size();k++) {
			System.out.println("points.getPoints().get("+k+").getSrcIf().getIfId() = " + points.getPoints().get(k).getSrcIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getSrcNode().getNodeId() = " + points.getPoints().get(k).getSrcNode().getNodeId());
			System.out.println("points.getPoints().get("+k+").getDestIf().getIfId() = " + points.getPoints().get(k).getDestIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getDestNode().getNodeId() = " + points.getPoints().get(k).getDestNode().getNodeId());
		}
		System.out.println("points.getNodeIfPoints().size()=======> " + points.getNodeIfPoints().size());
		for(Node srcNode : points.getNodeIfPoints().keySet()){
			System.out.println("srcNode.getNodeId()=======> " + srcNode.getNodeId());
			for (int i = 0; i < points.getNodeIfPoints().get(srcNode).size(); i++) {
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcNode().getNodeId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestNode().getNodeId());
			}
		}
	}

	/**
	 * Test method for {@link topo.utils.LoadData#loadCDPPoint(java.util.List, java.util.List, com.entity.PointLibrary)}.
	 */
	public void testLoadCDPPoint() {
		List<Node> nodes = new ArrayList<Node>();
		List<Interface> interfaces = new ArrayList<Interface>();
		PointLibrary points = new PointLibrary();
		loadData.loadResource(nodes, interfaces);
		loadData.loadCDPPoint(nodes, interfaces, points);
		System.out.println("points.getPoints().size()=======> " + points.getPoints().size());
		for(int k=0;k<points.getPoints().size();k++) {
			System.out.println("points.getPoints().get("+k+").getSrcIf().getIfId() = " + points.getPoints().get(k).getSrcIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getSrcNode().getNodeId() = " + points.getPoints().get(k).getSrcNode().getNodeId());
			System.out.println("points.getPoints().get("+k+").getDestIf().getIfId() = " + points.getPoints().get(k).getDestIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getDestNode().getNodeId() = " + points.getPoints().get(k).getDestNode().getNodeId());
		}
		System.out.println("points.getNodeIfPoints().size()=======> " + points.getNodeIfPoints().size());
		for(Node srcNode : points.getNodeIfPoints().keySet()){
			System.out.println("srcNode.getNodeId()=======> " + srcNode.getNodeId());
			for (int i = 0; i < points.getNodeIfPoints().get(srcNode).size(); i++) {
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcNode().getNodeId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestNode().getNodeId());
			}
		}
	}

	/**
	 * Test method for {@link topo.utils.LoadData#loadAFTPoint(java.util.List, java.util.List, com.entity.PointLibrary)}.
	 */
	public void testLoadAFTPoint() {
		List<Node> nodes = new ArrayList<Node>();
		List<Interface> interfaces = new ArrayList<Interface>();
		PointLibrary points = new PointLibrary();
		loadData.loadResource(nodes, interfaces);
		loadData.loadAFTPoint(nodes, interfaces, points);
		System.out.println("points.getPoints().size()=======> " + points.getPoints().size());
		for(int k=0;k<points.getPoints().size();k++) {
			System.out.println("points.getPoints().get("+k+").getSrcIf().getIfId() = " + points.getPoints().get(k).getSrcIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getSrcNode().getNodeId() = " + points.getPoints().get(k).getSrcNode().getNodeId());
			System.out.println("points.getPoints().get("+k+").getDestIf().getIfId() = " + points.getPoints().get(k).getDestIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getDestNode().getNodeId() = " + points.getPoints().get(k).getDestNode().getNodeId());
		}
		System.out.println("points.getNodeIfPoints().size()=======> " + points.getNodeIfPoints().size());
		for(Node srcNode : points.getNodeIfPoints().keySet()){
			System.out.println("srcNode.getNodeId()=======> " + srcNode.getNodeId());
			for (int i = 0; i < points.getNodeIfPoints().get(srcNode).size(); i++) {
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcNode().getNodeId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestNode().getNodeId());
			}
		}
	}

	/**
	 * Test method for {@link topo.utils.LoadData#loadManualPoint(java.util.List, java.util.List, com.entity.PointLibrary)}.
	 */
	public void testLoadManualPoint() {
		List<Node> nodes = new ArrayList<Node>();
		List<Interface> interfaces = new ArrayList<Interface>();
		PointLibrary points = new PointLibrary();
		loadData.loadResource(nodes, interfaces);
		loadData.loadManualPoint(nodes, interfaces, points);
		System.out.println("points.getPoints().size()=======> " + points.getPoints().size());
		for(int k=0;k<points.getPoints().size();k++) {
			System.out.println("points.getPoints().get("+k+").getSrcIf().getIfId() = " + points.getPoints().get(k).getSrcIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getSrcNode().getNodeId() = " + points.getPoints().get(k).getSrcNode().getNodeId());
			System.out.println("points.getPoints().get("+k+").getDestIf().getIfId() = " + points.getPoints().get(k).getDestIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getDestNode().getNodeId() = " + points.getPoints().get(k).getDestNode().getNodeId());
		}
		System.out.println("points.getNodeIfPoints().size()=======> " + points.getNodeIfPoints().size());
		for(Node srcNode : points.getNodeIfPoints().keySet()){
			System.out.println("srcNode.getNodeId()=======> " + srcNode.getNodeId());
			for (int i = 0; i < points.getNodeIfPoints().get(srcNode).size(); i++) {
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcNode().getNodeId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestNode().getNodeId());
			}
		}
	}

	/**
	 * Test method for {@link topo.utils.LoadData#loadPoint(java.util.List, java.util.List, com.entity.PointLibrary)}.
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public void testLoadPoint() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<Node> nodes = new ArrayList<Node>();
		List<Interface> interfaces = new ArrayList<Interface>();
		PointLibrary points = new PointLibrary();
		loadData.loadResource(nodes, interfaces);
		loadData.loadPoint(nodes, interfaces, points);
		System.out.println("points.getPoints().size()=======> " + points.getPoints().size());
		for(int k=0;k<points.getPoints().size();k++) {
			System.out.println("points.getPoints().get("+k+").getSrcIf().getIfId() = " + points.getPoints().get(k).getSrcIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getSrcNode().getNodeId() = " + points.getPoints().get(k).getSrcNode().getNodeId());
			System.out.println("points.getPoints().get("+k+").getDestIf().getIfId() = " + points.getPoints().get(k).getDestIf().getIfId());
			System.out.println("points.getPoints().get("+k+").getDestNode().getNodeId() = " + points.getPoints().get(k).getDestNode().getNodeId());
		}
		System.out.println("points.getNodeIfPoints().size()=======> " + points.getNodeIfPoints().size());
		for(Node srcNode : points.getNodeIfPoints().keySet()){
			System.out.println("srcNode.getNodeId()=======> " + srcNode.getNodeId());
			for (int i = 0; i < points.getNodeIfPoints().get(srcNode).size(); i++) {
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getSrcNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getSrcNode().getNodeId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestIf().getIfId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestIf().getIfId());
				System.out.println("points.getNodeIfPoints().get(srcNode).get("+i+").getDestNode().getNodeId()=======> "
						+ points.getNodeIfPoints().get(srcNode).get(i).getDestNode().getNodeId());
			}
		}
	}

	/**
	 * Test method for {@link topo.utils.LoadData#AddPoint(java.util.List, java.util.List, com.entity.PointLibrary, com.entity.StructPoint, int)}.
	 */
	public void testAddPoint() {
		//上面case已经包含
	}

}
