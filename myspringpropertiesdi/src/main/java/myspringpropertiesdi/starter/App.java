package myspringpropertiesdi.starter;

import myspringpropertiesdi.beans.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		Test t = (Test) context.getBean("testbean");
		System.out.println("test: " + t);

	}
}
