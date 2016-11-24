package com.entity;

import java.util.ArrayList;
import java.util.HashMap;

import com.pojo.Node;

public class PointLibrary {
	ArrayList<Point> points = new ArrayList<Point>();
	HashMap<Node, ArrayList<Point>> nodeIfPoints = new HashMap<Node, ArrayList<Point>>();
	public ArrayList<Point> getPoints() {
		return points;
	}
	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
	public HashMap<Node, ArrayList<Point>> getNodeIfPoints() {
		return nodeIfPoints;
	}
	public void setNodeIfPoints(HashMap<Node, ArrayList<Point>> nodeIfPoints) {
		this.nodeIfPoints = nodeIfPoints;
	}
}
