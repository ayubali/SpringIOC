package mypringdemo.beans;

public class Car {

	private Engine engine;
	private String name;

	public Car() {
		System.out.println("car cons");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [enine=" + engine + ", name=" + name + "]";
	}

}
