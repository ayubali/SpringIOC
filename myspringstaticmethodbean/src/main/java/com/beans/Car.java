package com.beans;

public class Car {
	private static String name;

	public static void setName(String name) {
		Car.name = name;
	}

	public static void printdata() {
		System.out.println("Car name: " + Car.name);
	}

}
