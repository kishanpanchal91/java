package com.java.core;

public class Inheritance extends SubClass {

	//In Inheritance we can inherit static and non static method.
	//but int static method it will define call between class scope.
	public void display() {
		System.out.println("subClass Child Class");
	}
	public static void print() {
		System.out.println("Print subClass Child Class");
	}

	public static void main(String[] args) {
		Parent p = new Inheritance();
		p.display();
		p.print();
		print();
	}
}

class Parent {

	public void display() {
		System.out.println("Parent");
	}
	static public void print() {
		System.out.println("Print Parent");
	}
}

class SubClass extends Parent {
	public void display() {
		System.out.println("subClass");
	}
	static public void print() {
		System.out.println("Print subClass");
	}

}