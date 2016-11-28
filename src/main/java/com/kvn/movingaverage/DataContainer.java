package com.kvn.movingaverage;

import com.kvn.movingaverage.dao.DaoData;

public class DataContainer {
	private static DataContainer instance = null;
	private DaoData daoData;
	private TimeseriesData timeSeriesData;
	
	public DataContainer(){
		daoData = new DaoData();
		timeSeriesData = new TimeseriesData();
	}
	
	public static DataContainer getInstance(){
		if(instance == null){
			instance = new DataContainer();
		}
		return instance;
	}

	public DaoData getDaoData() {
		return daoData;
	}

	public TimeseriesData getTimeSeriesData() {
		return timeSeriesData;
	}
}