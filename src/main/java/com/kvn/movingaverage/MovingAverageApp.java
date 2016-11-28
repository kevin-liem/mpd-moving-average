package com.kvn.movingaverage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvn.movingaverage.model.Data;

@SpringBootApplication
public class MovingAverageApp {

	public static void main(String[] args) {
		SpringApplication.run(MovingAverageApp.class, args);
		
//		DataContainer.getInstance().getDaoData().save(new Data(1, 1));
//		DataContainer.getInstance().getDaoData().save(new Data(2, 3));
//		DataContainer.getInstance().getDaoData().save(new Data(3, 3));
//		DataContainer.getInstance().getDaoData().save(new Data(4, 1));
//		DataContainer.getInstance().getDaoData().save(new Data(5, 2));
//		DataContainer.getInstance().getDaoData().save(new Data(6, 1));
//		DataContainer.getInstance().getDaoData().save(new Data(7, 1));
//		DataContainer.getInstance().getDaoData().save(new Data(8, 4));
//		DataContainer.getInstance().getDaoData().save(new Data(9, 1));
//		DataContainer.getInstance().getDaoData().save(new Data(10, 1));
	}
}