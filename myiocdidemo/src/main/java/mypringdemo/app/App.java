package mypringdemo.app;

import mypringdemo.beans.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
		// find the xml
		Resource resource = new ClassPathResource("spring.xml");

		// // BeanFactory factory = new XmlBeanFactory(resource);
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("spring.xml");
		// Hello hello1 = (Hello) context.getBean("hellobean");
		// Hello hello2 = (Hello) context.getBean("hellobean");
		// Hello hello3 = (Hello) context.getBean("hellobean");
		// System.out.println(hello1 == hello2);
		// System.out.println(hello2 == hello3);
		// hello1.hello();

		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "spring.xml");

		// context.getBean("hellobean");
		//
		// Test test= (Test)context.getBean("testbean");
		// test.hello(" ayub ");

		// Student student = (Student) context.getBean("studentbean");
		// System.out.println(student);
		//
		// Person person = (Person) context.getBean("personbean");
		// System.out.println(person);

		String[] files = new String[] { "car.xml" };
		ApplicationContext context2 = new ClassPathXmlApplicationContext(files);

		Car car = (Car) context2.getBean("carbean");
		System.out.println("car: " + car);

	}
}
