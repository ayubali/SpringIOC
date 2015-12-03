package beans;

public class Engine {

	private String model;

	public Engine() {
		System.out.println("Engine cons");
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + "]";
	}

}
