package beans;

public class Bus {
	private Engine engine;

	public Bus() {
		System.out.println("bus constructor");
	}

	public Bus(Engine engine) {
		super();
		this.engine = engine;
		System.out.println("parameterized bis constructor");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Bus [engine=" + engine + "]";
	}

}
