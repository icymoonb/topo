package com.data;

public class SingleAFTPointData {
	private long srcNodeId;
	private long srcIfId;
	private String destMac;
	private long destNodeId = 0;
	private long destIfId = 0;
	
	public long getSrcNodeId() {
		return srcNodeId;
	}
	public void setSrcNodeId(long srcNodeId) {
		this.srcNodeId = srcNodeId;
	}
	public long getSrcIfId() {
		return srcIfId;
	}
	public void setSrcIfId(long srcIfId) {
		this.srcIfId = srcIfId;
	}
	public String getDestMac() {
		return destMac;
	}
	public void setDestMac(String destMac) {
		this.destMac = destMac;
	}
	public long getDestNodeId() {
		return destNodeId;
	}
	public void setDestNodeId(long destNodeId) {
		this.destNodeId = destNodeId;
	}
	public long getDestIfId() {
		return destIfId;
	}
	public void setDestIfId(long destIfId) {
		this.destIfId = destIfId;
	}
}
