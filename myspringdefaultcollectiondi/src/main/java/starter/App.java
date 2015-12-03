package starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Test test = (Test) context.getBean("testbean");
		System.out.println("test: " + test);
	}

}
