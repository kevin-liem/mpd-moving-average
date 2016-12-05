package com.kvn.movingaverage;

import com.kvn.movingaverage.dao.DaoData;
import com.kvn.movingaverage.model.ResultData;

public class DataContainer {
	private static DataContainer instance = null;
	private DaoData daoData;
	private TimeseriesData timeSeriesData;
	private ResultData resultData;
	
	public DataContainer(){
		daoData = new DaoData();
		timeSeriesData = new TimeseriesData();
		resultData = new ResultData();
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

	public ResultData getResultData() {
		return resultData;
	}
}