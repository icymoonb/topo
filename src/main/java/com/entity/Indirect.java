package com.entity;

import com.pojo.Interface;
import com.pojo.Node;

public class Indirect {
	Node node1 = null;
	Interface if1 = null;
	Node node2 = null;
	Interface if2 = null;
	int reliably;
	public Node getNode1() {
		return node1;
	}
	public void setNode1(Node node1) {
		this.node1 = node1;
	}
	public Interface getIf1() {
		return if1;
	}
	public void setIf1(Interface if1) {
		this.if1 = if1;
	}
	public Node getNode2() {
		return node2;
	}
	public void setNode2(Node node2) {
		this.node2 = node2;
	}
	public Interface getIf2() {
		return if2;
	}
	public void setIf2(Interface if2) {
		this.if2 = if2;
	}
	public int getReliably() {
		return reliably;
	}
	public void setReliably(int reliably) {
		this.reliably = reliably;
	}
	public Direct changeToDirect() {
		Direct direct = new Direct();
		direct.setIf1(this.if1);
		direct.setIf2(this.if2);
		direct.setNode1(this.node1);
		direct.setNode2(this.node2);
		return direct;
	}
}
