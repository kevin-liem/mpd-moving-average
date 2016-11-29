package com.kvn.movingaverage.model;

import java.util.LinkedList;
import java.util.List;

// Represent one record in Table
public class Data {
	private int id;
	private Object xAxis;
	private List<Object> yAxis;
	
	public Data(Object xAxis, Object yAxis) {
		super();
		this.xAxis = xAxis;
		
		yAxis = new LinkedList<Object>();
		this.yAxis.add(yAxis);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getxAxis() {
		return xAxis;
	}

	public void setxAxis(Object xAxis) {
		this.xAxis = xAxis;
	}

	public Object getyAxis() {
		return yAxis;
	}

	public void setyAxis(Object yAxis) {
		this.yAxis.add(yAxis);
	}
	
	public void setyAxis(int index, Object yAxis) {
		if(this.yAxis.size() < index){
			this.yAxis.set(index, yAxis);
		}
		else {
			this.yAxis.add(yAxis);
		}
	}
}
