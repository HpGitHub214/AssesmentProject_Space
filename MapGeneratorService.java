package com.map.assesment.contoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.map.assesment.bean.City;

public class MapGeneratorService {
	List<City> citiesDataList = new ArrayList();
	
	
	public List<City> getCitiesDataList() {
		return citiesDataList;
	}

	public void setCitiesDataList(List<City> citiesDataList) {
		this.citiesDataList = citiesDataList;
	}

	public void randomCities(){
		int noOfCities = 10;
		Random rd = new Random();

		  for (int i = 0; i < noOfCities; i++) {
	            String name = "City" + (i + 1);
	            double latitude = -90 + (90 - (-90)) * rd.nextDouble();
	            double longitude = -180 + (180 - (-180)) * rd.nextDouble();
	            citiesDataList.add(new City(name, latitude, longitude));
	        }
	    }

	    public void printCities() {
	        for (City city : citiesDataList) {
	            System.out.println(city.getCityName() + "\t=> " + city.getCityLatitude() + " , " + city.getCityLongitude());
	        }
	    }

}
