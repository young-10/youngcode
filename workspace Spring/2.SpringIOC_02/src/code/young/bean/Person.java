package code.young.bean;

import java.util.List;


import java.util.Map;
import java.util.Properties;



public class Person {
	private String name;
	private int  age;
	private String gender;
	private String email;
	
	private Car car;
	private List<book> books;
	private Map<String, Object> map;
	private Properties pros;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<book> getBooks() {
		return books;
	}

	public void setBooks(List<book> books) {
		this.books = books;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getPros() {
		return pros;
	}

	public void setPros(Properties pros) {
		this.pros = pros;
	}

	public Person() {
		super();
		System.out.println("Person创建了");
	}

	public Person(Car car) {
		super();
		this.car = car;
		System.out.println("可以为car赋值的有参构造器。。。。");
	}

//	public Person(String name, int age, char gender) {
//		System.out.println("三个参数的构造器");
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}

//	public Person(String name, int age, char gender, String email) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.email = email;
//		System.out.println("有参构造器被调用");
//	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender
				+ ", email=" + email + ", car=" + car + ", books=" + books
				+ ", map=" + map + ", pros=" + pros + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName方法被调用");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
