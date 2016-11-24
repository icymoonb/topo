package com.entity;

import java.util.ArrayList;

public class IndirectLibrary {
	ArrayList<Indirect> indirects = new ArrayList<Indirect>();
	ArrayList<NodeIfIndirect> nodeIfIndirects = new ArrayList<NodeIfIndirect>();
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
