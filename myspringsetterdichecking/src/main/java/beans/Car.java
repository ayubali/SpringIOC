package beans;

public class Car {

	private String name;
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}

}
