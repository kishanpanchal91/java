package com.java.core;

public class KeyWordSuper extends SuperClass {
	
	public KeyWordSuper() {
		super();
		System.out.println("This is super class constructor");
	}
	public static void main(String[] args) {
		KeyWordSuper andThis=new KeyWordSuper();
	}
}

class SuperClass {
	public SuperClass() {
		System.out.println("This is child class constructor");

	}
}
