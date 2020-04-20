package com.revature.beans;

public class CarBean {
	
	public String brand;
	public int carMileage;
	
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public int getCarMileage() {
		return carMileage;
	}
	
	public void setCarMileage (int carMileage) {
		this.carMileage=carMileage;
	}

	@Override
	public String toString() {
		return "Driver [Brand=" + brand + ", Car Mileage=" + carMileage + "]";
	}

	
	
	
	

}
