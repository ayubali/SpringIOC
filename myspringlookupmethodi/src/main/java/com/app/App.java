package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Bus;
import com.beans.Car;
import com.beans.Truk;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		System.out.println("............Interface Car...............");
		Car c = (Car) context.getBean("c");
		System.out.println("car: " + c.myCarEngine());
		System.out.println("car type: " + c.getClass().getCanonicalName());

		System.out.println("............Abstract Bus...............");
		Bus b = (Bus) context.getBean("b");
		System.out.println("car: " + b.myBusEngine());
		System.out.println("car type: " + b.getClass().getCanonicalName());

		
		System.out.println("............Concrete Truk...............");
		Truk t= (Truk) context.getBean("t");
		System.out.println("car: " + t.mytrukEngine());
		System.out.println("car type: " + t.getClass().getCanonicalName());

	}

}
