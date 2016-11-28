package com.kvn.movingaverage;

public class TimeseriesData {
	private int n;
	private int T;

	public TimeseriesData() {
		
	}

	public TimeseriesData(int n, int t) {
		this.n = n;
		T = t;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getT() {
		return T;
	}

	public void setT(int t) {
		T = t;
	}
}