package com.map.assesment.bean;

public class City {

	private String cityName;

	private double cityLatitude;

	private double cityLongitude;

	public City(String name, double latitude, double longitude) {
		this.cityName = name;
		this.cityLatitude = latitude;
		this.cityLongitude = longitude;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getCityLatitude() {
		return cityLatitude;
	}

	public void setCityLatitude(double cityLatitude) {
		this.cityLatitude = cityLatitude;
	}

	public double getCityLongitude() {
		return cityLongitude;
	}

	public void setCityLongitude(double cityLongitude) {
		this.cityLongitude = cityLongitude;
	}

	@Override
	public String toString() {
		return "CityDetails [cityName=" + cityName + ", cityLatitude=" + cityLatitude + ", cityLongitude="
				+ cityLongitude + "]";
	}

}
