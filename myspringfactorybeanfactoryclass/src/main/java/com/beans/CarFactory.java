package com.beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Car> {

	private String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	// public Car getInstance() throws Exception {
	// Car c = (Car) Class.forName(carName).newInstance();
	// return c;
	// }

	public Car getObject() throws Exception {
		Car c = (Car) Class.forName(carName).newInstance();
		return c;
	}

	public Class<?> getObjectType() {

		return Car.class;
	}

	public boolean isSingleton() {
		return true;
	}
}
