package com.java.designpattern;

public class SingleToneClass {

	public static void main(String[] args) {
		SingleClass class1 = SingleClass.getInstance();
		class1.print();

	}

}

class SingleClass {
	private static SingleClass singleToneClass = null;
	static {
		System.out.println("SingleClass class is Intialized");
		singleToneClass = new SingleClass();

	}

	private SingleClass() {
		System.out.println("This is private Constructor");
	}

	public static SingleClass getInstance() {
		return singleToneClass;
	}

	public void print() {
		System.out.println("This singletone class method");
	}

}
