package starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring_auto_annotation.xml");

		Car b = (Car) context.getBean("c");
		System.out.println("Car:" + b);
	}
}
