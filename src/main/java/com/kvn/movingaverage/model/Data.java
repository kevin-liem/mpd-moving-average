package com.kvn.movingaverage.model;

import java.util.LinkedList;
import java.util.List;

// Represent one record in Table
public class Data {
	private int id;
	private Integer xAxis;
	private Integer yAxis;
	private List<PredictionData> T;
	
	public Data(Integer xAxis, Integer yAxis) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;

		T = new LinkedList<PredictionData>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getxAxis() {
		return xAxis;
	}

	public void setxAxis(Integer xAxis) {
		this.xAxis = xAxis;
	}

	public Integer getyAxis() {
		return yAxis;
	}

	public void setyAxis(Integer yAxis) {
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