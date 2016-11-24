package com.entity;

import com.pojo.Interface;
import com.pojo.Node;

public class Point {
	Node srcNode = null;
	Interface srcIf = null;
	Node destNode = null;
	Interface destIf = null;
	int reliably;
	public Node getSrcNode() {
		return srcNode;
	}
	public void setSrcNode(Node srcNode) {
		this.srcNode = srcNode;
	}
	public Interface getSrcIf() {
		return srcIf;
	}
	public void setSrcIf(Interface srcIf) {
		this.srcIf = srcIf;
	}
	public Node getDestNode() {
		return destNode;
	}
	public void setDestNode(Node destNode) {
		this.destNode = destNode;
	}
	public Interface getDestIf() {
		return destIf;
	}
	public void setDestIf(Interface destIf) {
		this.destIf = destIf;
	}
	public int getReliably() {
		return reliably;
	}
	public void setReliably(int pR_Point) {
		this.reliably = pR_Point;
	}
	
}
