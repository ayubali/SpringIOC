package starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.DAO;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		DAO dao = (DAO) context.getBean("daobean1");
		System.out.println("DAO: " + dao);

	}
}
