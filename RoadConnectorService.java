package com.map.assesment.contoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.map.assesment.bean.City;
import com.map.assesment.bean.Road;

public class RoadConnectorService {

	private List<Road> roadsDataList = new ArrayList();

	public List<Road> getRoadsDataList() {
		return roadsDataList;
	}

	public void setRoadsDataList(List<Road> roadsDataList) {
		this.roadsDataList = roadsDataList;
	}

	// Connection Cities
	public void connectCities(List<City> cities) {
		Random rd = new Random();
		for (City city1 : cities) {
			City city2 = cities.get(rd.nextInt(cities.size()));
			int lanes = rd.nextInt(4) + 1; 
			roadsDataList.add(new Road(city1, city2, lanes));
		}
	}

}
