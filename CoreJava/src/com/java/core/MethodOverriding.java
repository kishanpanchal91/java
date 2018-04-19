package com.java.core;

public class MethodOverriding extends A{
	
	public static void add(int a,int b) {
		System.out.println("Add In Class MethodOverriding "+(a+b));
		
	}
	public  void sub(int a,int b) {
		System.out.println("Sub In Class MethodOverriding"+(a+b));
		
	}
	
	public static void main(String[] args) {
		add(10,10);
		A methodOverriding=new MethodOverriding();
		methodOverriding.sub(10, 20);
	}
}


class A{
	
	public static void add(int a,int b) {
		System.out.println("Add In Class A "+(a+b));
		
	}
	public  void sub(int a,int b) {
		System.out.println("Sub In Class A "+(a+b));
		
	}
}