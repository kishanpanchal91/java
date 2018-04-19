package com.java.core;

public class AbstractClassConstructor extends AbstractClass {

	AbstractClassConstructor() {
		String a="A";
		a="B";
		System.out.println(":::AbstractClassConstructor::::" + toString()+ "::"+a);
	}

	public static void main(String[] args) {
		
		AbstractClassConstructor abstractClassConstructor = new AbstractClassConstructor();
	}
}

abstract class AbstractClass {
	public AbstractClass() {
		System.out.println(":::Absstract Class:::" + toString());
	}
}
