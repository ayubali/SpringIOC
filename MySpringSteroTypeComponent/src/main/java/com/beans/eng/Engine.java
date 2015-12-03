package com.beans.eng;

public class Engine {
	private String model;

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + "]";
	}

}
