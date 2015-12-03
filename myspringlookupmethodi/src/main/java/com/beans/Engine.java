package com.beans;

public class Engine {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + "]";
	}
	
	
}
