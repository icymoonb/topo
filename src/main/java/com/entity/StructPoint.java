package com.entity;

public class StructPoint {
	private Long srcNodeId;
	private Long srcIfId;
	private Long destNodeId;
	private Long destIfId;
	private String destMac = "";
	public Long getSrcNodeId() {
		return srcNodeId;
	}
	public void setSrcNodeId(Long srcNodeId) {
		this.srcNodeId = srcNodeId;
	}
	public Long getSrcIfId() {
		return srcIfId;
	}
	public void setSrcIfId(Long srcIfId) {
		this.srcIfId = srcIfId;
	}
	public Long getDestNodeId() {
		return destNodeId;
	}
	public void setDestNodeId(Long destNodeId) {
		this.destNodeId = destNodeId;
	}
	public Long getDestIfId() {
		return destIfId;
	}
	public void setDestIfId(Long destIfId) {
		this.destIfId = destIfId;
	}
	public String getDestMac() {
		return destMac;
	}
	public void setDestMac(String destMac) {
		this.destMac = destMac;
	}
}
