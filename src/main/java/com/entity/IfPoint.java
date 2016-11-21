package com.entity;

import java.util.ArrayList;

import com.pojo.Interface;

public class IfPoint {
	Interface srcIf = null;
	ArrayList<Point> points = null;
	public Interface getSrcIf() {
		return srcIf;
	}
	public void setSrcIf(Interface srcIf) {
		this.srcIf = srcIf;
	}
	public ArrayList<Point> getPoints() {
		return points;
	}
	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
}
