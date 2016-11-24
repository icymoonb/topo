package topo.topo;

import java.util.ArrayList;
import java.util.List;

import com.entity.PointLibrary;
import com.entity.Topo;
import com.pojo.Interface;
import com.pojo.Node;

import junit.framework.TestCase;
import topo.utils.LoadData;
import topo.utils.TopoUtils;

public class AlgorithmTest extends TestCase {
	Topo topo = new Topo();
	List<Node> nodes = new ArrayList<Node>();
	List<Interface> interfaces = new ArrayList<Interface>();
	PointLibrary points = new PointLibrary();
	
	final static LoadData loadData = new LoadData();
	final static Algorithm algorithm = new Algorithm();
	final static TopoUtils topoUtils = new TopoUtils();
	
	protected void setUp() throws Exception {
		loadData.loadResource(nodes, interfaces);
		loadData.loadPoint(nodes, interfaces, points);
		super.setUp();
	}

	public void testCalculateIndirect() {
		fail("Not yet implemented"); // TODO
	}

	public void testRemoveIndirect() {
		fail("Not yet implemented"); // TODO
	}

	public void testIndirectRemoveTopo() {
		fail("Not yet implemented"); // TODO
	}

	public void testGetLeafPoints() {
		fail("Not yet implemented"); // TODO
	}

	public void testRouteTopo() {
		fail("Not yet implemented"); // TODO
	}

	public void testLeafConnectTopo() {
		fail("Not yet implemented"); // TODO
	}

	public void testIsNodeConnect() {
		fail("Not yet implemented"); // TODO
	}

	public void testGetFirstIfByNode() {
		fail("Not yet implemented"); // TODO
	}

}
