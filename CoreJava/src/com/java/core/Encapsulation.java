package com.java.core;

public class Encapsulation {
	public static void main(String[] args) {
		//we can access data by it's getter methods
		//we are not use directly by it's name because it is private attribute
		Student student=new Student("10","smit", "24");
		System.out.println(student);
		
	}
}

class Student {

	private String id;
	private String name;
	private String age;

	public Student(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
