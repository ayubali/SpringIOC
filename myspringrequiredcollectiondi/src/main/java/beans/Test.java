

package beans;

import java.util.Hashtable;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	private Vector fruits;
	private TreeSet criketers;
	private Hashtable cc;

	public Test() {
		System.out.println("Test Xons");
	}

	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	public void setCriketers(TreeSet criketers) {
		this.criketers = criketers;
	}

	public void setCc(Hashtable cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Test [fruits=" + fruits + ", criketers=" + criketers + ", cc="
				+ cc + "]";
	}

}
