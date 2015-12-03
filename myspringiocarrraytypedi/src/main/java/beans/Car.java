package beans;

import java.util.Arrays;

public class Car {
	private String[] names;
	private Engine[] engines;

	public Car() {
		System.out.println("Car cons");
	}

	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Car [names=" + Arrays.toString(names) + ", engines="
				+ Arrays.toString(engines) + "]";
	}

}
