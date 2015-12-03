package myspringpropertiesdi.beans;

import java.util.Properties;

public class Test {
	private Properties driver;

	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Test [driver=" + driver + "]";
	}

}
