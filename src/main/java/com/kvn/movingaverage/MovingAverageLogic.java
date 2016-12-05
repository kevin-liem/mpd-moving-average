package com.kvn.movingaverage;

import com.kvn.movingaverage.model.Data;
import com.kvn.movingaverage.model.PredictionData;
import jdk.internal.util.xml.impl.Input;

import java.util.List;

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
				for (int k = i - j; k < i; k++){
					Taksen += DataContainer.getInstance().getDaoData().getById(k).getyAxis().floatValue();
				}
				Taksen /= (float)j;

				Float err = Math.abs(Taksen - DataContainer.getInstance().getDaoData().getById(i).getyAxis());

				DataContainer.getInstance().getDaoData().getById(i).getT().add(new PredictionData(Taksen, err));
			}
		}

		if(T <= 0){
			Integer minT = 0;
			Float minTvalue = 999999f;
			Float minErrorValue = 999999f;
			Float tmpError = 0f;
			Float tmpT = 0f;

			// Loop through T value
			for (int i = 1; i < Tmax; i++){
				int dataCount = 0;

				// Loop through data
				for(int j = 0; j < n; j++){
					// If no T value then skip this data
					if(DataContainer.getInstance().getDaoData().getById(j+1).getT().size() < i){
						continue;
					}
					tmpT += DataContainer.getInstance().getDaoData().getById(j+1).getT().get(i-1).getTvalue();
					tmpError += DataContainer.getInstance().getDaoData().getById(j+1).getT().get(i-1).getErrorValue();
                    dataCount++;
                }

				tmpT /= dataCount;
				tmpError /= dataCount;
				if(tmpError < minErrorValue){
					minTvalue = tmpT;
					minErrorValue = tmpError;
					minT = i + 1;
                }
				tmpT = 0f;
				tmpError = 0f;
			}
			DataContainer.getInstance().getResultData().setN(n+1);
			DataContainer.getInstance().getResultData().setT(minT);
			DataContainer.getInstance().getResultData().setTvalue(minTvalue);
			DataContainer.getInstance().getResultData().setErrorValue(minErrorValue);
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