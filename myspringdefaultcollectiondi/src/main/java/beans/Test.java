package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List fruits;
	private Set criketers;
	private Map cc;

	public Test() {
		System.out.println("Test Xons");
	}

	public void setFruits(List fruits) {
		this.fruits = fruits;
	}

	public void setCriketers(Set criketers) {
		this.criketers = criketers;
	}

	public void setCc(Map cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Test [fruits=" + fruits + ", criketers=" + criketers + ", cc="
				+ cc + "]";
	}

}

