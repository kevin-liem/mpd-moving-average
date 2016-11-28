package com.kvn.movingaverage;

public class MovingAverageLogic {
	public void CalculateDataSeries(){
		int n = DataContainer.getInstance().getTimeSeriesData().getN();
		int T = DataContainer.getInstance().getTimeSeriesData().getT();
		DataContainer.getInstance().getDaoData().getById(3).setyAxis(3);
	}
}