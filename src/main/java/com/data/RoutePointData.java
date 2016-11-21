package com.data;

public class RoutePointData {
	private int srcNodeId;
	private int srcIfIndex;
	private int srcIfId;
	private int destNodeId;
	private int destIfIndex;
	private int destIfId;
	
	public int getSrcNodeId() {
		return srcNodeId;
	}
	public void setSrcNodeId(int srcNodeId) {
		this.srcNodeId = srcNodeId;
	}
	public int getSrcIfIndex() {
		return srcIfIndex;
	}
	public void setSrcIfIndex(int srcIfIndex) {
		this.srcIfIndex = srcIfIndex;
	}
	public int getSrcIfId() {
		return srcIfId;
	}
	public void setSrcIfId(int srcIfId) {
		this.srcIfId = srcIfId;
	}
	public int getDestNodeId() {
		return destNodeId;
	}
	public void setDestNodeId(int destNodeId) {
		this.destNodeId = destNodeId;
	}
	public int getDestIfIndex() {
		return destIfIndex;
	}
	public void setDestIfIndex(int destIfIndex) {
		this.destIfIndex = destIfIndex;
	}
	public int getDestIfId() {
		return destIfId;
	}
	public void setDestIfId(int destIfId) {
		this.destIfId = destIfId;
	}
	
}
