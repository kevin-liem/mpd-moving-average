package com.kvn.movingaverage.dao;

import java.util.ArrayList;
import java.util.List;

import com.kvn.movingaverage.model.Data;

public class DaoData {
private List<Data> listData = new ArrayList<Data>();
	
	public DaoData(){
		
	}
	
	public void save(Data data){
		data.setId(listData.size()+1);
		listData.add(data);
	}
	
	public List<Data> getAll(){
		return listData;
	}
	
	public Data getById(int dataId){
		for (Data data : listData) {
			if(dataId == data.getId()){
				return data;
			}
		}
		return null;
	}
}