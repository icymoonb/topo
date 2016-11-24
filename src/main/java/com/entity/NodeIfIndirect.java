package com.entity;

import java.util.ArrayList;

import com.pojo.Node;

public class NodeIfIndirect {
	private Node node;
	private ArrayList<IfIndirect> ifIndirects = new ArrayList<IfIndirect>();
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public ArrayList<IfIndirect> getIfIndirects() {
		return ifIndirects;
	}
	public void setIfIndirects(ArrayList<IfIndirect> ifIndirects) {
		this.ifIndirects = ifIndirects;
	}
}
