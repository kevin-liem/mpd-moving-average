package com.kvn.movingaverage;

public class TimeseriesData {
	private Integer n;
	private Integer T;

	public TimeseriesData() {
		
	}

	public TimeseriesData(Integer n, Integer t) {
		this.n = n;
		T = t;
	}

	public int getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public int getT() {
		return T;
	}

	public void setT(Integer t) {
		T = t;
	}
}