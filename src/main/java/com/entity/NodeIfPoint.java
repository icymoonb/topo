package com.entity;

import java.util.ArrayList;

import com.pojo.Node;

public class NodeIfPoint {
	Node srcNode = null;
	ArrayList<Point> ifPoints = null;
	public Node getSrcNode() {
		return srcNode;
	}
	public void setSrcNode(Node srcNode) {
		this.srcNode = srcNode;
	}
	public ArrayList<Point> getIfPoints() {
		return ifPoints;
	}
	public void setIfPoints(ArrayList<Point> ifPoints) {
		this.ifPoints = ifPoints;
	}
}
