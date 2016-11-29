package com.kvn.movingaverage.model;

import java.util.LinkedList;
import java.util.List;

// Represent one record in Table
public class Data {
	private int id;
	private Object xAxis;
	private Object yAxis;
	private List<PredictionData> T;
	
	public Data(Object xAxis, Object yAxis) {
		super();
		this.xAxis = xAxis;
		
		yAxis = new LinkedList<Object>();
		this.yAxis = yAxis;

		T = new LinkedList<PredictionData>();
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
		this.yAxis = yAxis;
	}

	public List<PredictionData> getT(){ return T; }

	public void setT(int index, PredictionData value) {
		if(this.T.size() < index){
			this.T.set(index, value);
		}
		else {
			this.T.add(value);
		}
	}
}