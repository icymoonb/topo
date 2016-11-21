package com.entity;

import java.util.ArrayList;

public class NodeIfIndirect {
	ArrayList<Indirect> indirects;
	ArrayList<NodeIfIndirect> nodeIfIndirects;
	public ArrayList<Indirect> getIndirects() {
		return indirects;
	}
	public void setIndirects(ArrayList<Indirect> indirects) {
		this.indirects = indirects;
	}
	public ArrayList<NodeIfIndirect> getNodeIfIndirects() {
		return nodeIfIndirects;
	}
	public void setNodeIfIndirects(ArrayList<NodeIfIndirect> nodeIfIndirects) {
		this.nodeIfIndirects = nodeIfIndirects;
	}
	
}
