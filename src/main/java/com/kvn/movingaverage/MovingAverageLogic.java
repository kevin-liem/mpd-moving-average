package com.kvn.movingaverage;

import com.kvn.movingaverage.model.Data;
import jdk.internal.util.xml.impl.Input;

public class MovingAverageLogic {
	public void CalculateDataSeries(){
		Integer n = DataContainer.getInstance().getTimeSeriesData().getN();
		if(n == null){
			n = 12;
			InputDefaultValue();
		}

		Integer T = DataContainer.getInstance().getTimeSeriesData().getT();

		DataContainer.getInstance().getDaoData().getById(3).setyAxis(3);
	}

	private void InputDefaultValue(){
		DataContainer.getInstance().getDaoData().save(new Data(1, 1));
		DataContainer.getInstance().getDaoData().save(new Data(2, 3));
		DataContainer.getInstance().getDaoData().save(new Data(3, 3));
		DataContainer.getInstance().getDaoData().save(new Data(4, 1));
		DataContainer.getInstance().getDaoData().save(new Data(5, 2));
		DataContainer.getInstance().getDaoData().save(new Data(6, 1));
		DataContainer.getInstance().getDaoData().save(new Data(7, 1));
		DataContainer.getInstance().getDaoData().save(new Data(8, 4));
		DataContainer.getInstance().getDaoData().save(new Data(9, 1));
		DataContainer.getInstance().getDaoData().save(new Data(10, 1));
		DataContainer.getInstance().getDaoData().save(new Data(11, 3));
		DataContainer.getInstance().getDaoData().save(new Data(12, 2));
	}
}