package starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring_auto.xml");

		Bus b = (Bus) context.getBean("b");
		System.out.println("Bus:" + b);
	}
}
