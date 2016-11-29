package com.kvn.movingaverage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvn.movingaverage.model.Data;

@SpringBootApplication
public class MovingAverageApp {

	public static void main(String[] args) {
		SpringApplication.run(MovingAverageApp.class, args);
	}
}