package beans;

public class Engine {
	private String model;

	public void setModel(String name) {
		this.model = name;
	}

	@Override
	public String toString() {
		return "Engine [name=" + model + "]";
	}

}
