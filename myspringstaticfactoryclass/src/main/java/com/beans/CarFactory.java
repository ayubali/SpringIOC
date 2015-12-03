package com.beans;

public class CarFactory {

	public static String carName;

	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}

	// static factory
	public static Car getInstance() throws Exception {
		Car c = (Car) Class.forName(carName).newInstance();
		return c;
	}
}
