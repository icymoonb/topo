package com.data;

public class PointData {
	private long srcNodeId;
	private long srcIfIndex;
	private long srcIfId;
	private long destNodeId;
	private long destIfIndex;
	private long destIfId;
	private String destIfName;
	
	
	public long getSrcNodeId() {
		return srcNodeId;
	}
	public void setSrcNodeId(long srcNodeId) {
		this.srcNodeId = srcNodeId;
	}
	public long getSrcIfIndex() {
		return srcIfIndex;
	}
	public void setSrcIfIndex(long srcIfIndex) {
		this.srcIfIndex = srcIfIndex;
	}
	public long getSrcIfId() {
		return srcIfId;
	}
	public void setSrcIfId(long srcIfId) {
		this.srcIfId = srcIfId;
	}
	public long getDestNodeId() {
		return destNodeId;
	}
	public void setDestNodeId(long destNodeId) {
		this.destNodeId = destNodeId;
	}
	public long getDestIfIndex() {
		return destIfIndex;
	}
	public void setDestIfIndex(long destIfIndex) {
		this.destIfIndex = destIfIndex;
	}
	public long getDestIfId() {
		return destIfId;
	}
	public void setDestIfId(long destIfId) {
		this.destIfId = destIfId;
	}
	public String getDestIfName() {
		return destIfName;
	}
	public void setDestIfName(String destIfName) {
		this.destIfName = destIfName;
	}
}
