package com.data;

public class SingleAFTPointData {
	private int srcNodeId;
	private int srcIfId;
	private String destMac;
	private int destNodeId = 0;
	private int destIfId = 0;
	
	public int getSrcNodeId() {
		return srcNodeId;
	}
	public void setSrcNodeId(int srcNodeId) {
		this.srcNodeId = srcNodeId;
	}
	public int getSrcIfId() {
		return srcIfId;
	}
	public void setSrcIfId(int srcIfId) {
		this.srcIfId = srcIfId;
	}
	public String getDestMac() {
		return destMac;
	}
	public void setDestMac(String destMac) {
		this.destMac = destMac;
	}
	public int getDestNodeId() {
		return destNodeId;
	}
	public void setDestNodeId(int destNodeId) {
		this.destNodeId = destNodeId;
	}
	public int getDestIfId() {
		return destIfId;
	}
	public void setDestIfId(int destIfId) {
		this.destIfId = destIfId;
	}
}
