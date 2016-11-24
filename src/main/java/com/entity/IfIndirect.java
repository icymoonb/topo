package com.entity;

import java.util.ArrayList;

import com.pojo.Interface;

public class IfIndirect {
	private Interface ife;
	private ArrayList<Indirect> indirects = new ArrayList<Indirect>();
	public Interface getIfe() {
		return ife;
	}
	public void setIfe(Interface ife) {
		this.ife = ife;
	}
	public ArrayList<Indirect> getIndirects() {
		return indirects;
	}
	public void setIndirects(ArrayList<Indirect> indirects) {
		this.indirects = indirects;
	}
}
