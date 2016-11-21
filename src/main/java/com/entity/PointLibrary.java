package com.entity;

import java.util.ArrayList;

public class PointLibrary {
	ArrayList<Point> points = null;
	ArrayList<NodeIfPoint> nodeIfPoints = null;
	public ArrayList<Point> getPoints() {
		return points;
	}
	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
	public ArrayList<NodeIfPoint> getNodeIfPoints() {
		return nodeIfPoints;
	}
	public void setNodeIfPoints(ArrayList<NodeIfPoint> nodeIfPoints) {
		this.nodeIfPoints = nodeIfPoints;
	}
	
}
