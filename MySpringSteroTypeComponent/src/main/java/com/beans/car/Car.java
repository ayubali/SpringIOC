package com.beans.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beans.eng.Engine;

@Component
public class Car {
	@Autowired
	private Engine engine;

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	
	

}
