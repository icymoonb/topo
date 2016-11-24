package topo.topo;

import java.util.ArrayList;
import java.util.List;

import com.entity.PointLibrary;
import com.entity.Topo;
import com.pojo.Interface;
import com.pojo.Node;

import topo.utils.LoadData;

public class TopoMain {
	public static void main(String[] args)
			throws Exception {
		LoadData loadData = new LoadData();
		Algorithm algorithm = new Algorithm();
		//初始化空间
		boolean TopoUseFullRouter = false;
		Topo topo = new Topo();
		List<Node> nodes = new ArrayList<Node>();
		List<Interface> interfaces = new ArrayList<Interface>();
		PointLibrary points = new PointLibrary();
		
		//加载数据
		loadData.loadResource(nodes, interfaces);
		loadData.loadPoint(nodes, interfaces, points);
		
		//计算
		algorithm.IndirectRemoveTopo(nodes, interfaces, points, topo);
		algorithm.leafConnectTopo(nodes, interfaces, points, topo);
		algorithm.routeTopo(nodes, interfaces, topo, TopoUseFullRouter);
		
		//保存结果
		SaveTopoToBackboneLine(topo);
	}
	
	/**
	 * 存储拓扑信息，保存结果
	 * @param topo
	 */
	private static void SaveTopoToBackboneLine(Topo topo)  {
		//TODO
	}
}