package com.kvn.movingaverage;

import com.kvn.movingaverage.model.Data;
import com.kvn.movingaverage.model.PredictionData;
import jdk.internal.util.xml.impl.Input;

public class MovingAverageLogic {
	public static void CalculateDataSeries(){
		Integer n = DataContainer.getInstance().getTimeSeriesData().getN();

		Integer T = DataContainer.getInstance().getTimeSeriesData().getT();
		int Tmax;
		if(T <= 0){
			Tmax = 10;
		}
		else {
			Tmax = T;
		}

		for (int i = 3; i <= n; i++){
			for(int j = 2; j < i; j++){
				Float Taksen = 0f;
				for (int k = i - j; k < n; k++){
					Taksen += DataContainer.getInstance().getDaoData().getById(k).getyAxis().floatValue();
				}
				Taksen /= j + 1;

				Float err = Taksen - DataContainer.getInstance().getDaoData().getById(i).getyAxis();

				DataContainer.getInstance().getDaoData().getById(i).getT().add(new PredictionData(Taksen, err));
			}
		}
	}

	public static void InputDefaultValue(){
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