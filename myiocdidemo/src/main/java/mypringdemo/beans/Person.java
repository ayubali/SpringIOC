package mypringdemo.beans;

public class Person {
	private String name;
	private int age;
	private String email;

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(int age) {
		super();
		this.age = age;
	}

	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email
				+ "]";
	}

	

}
