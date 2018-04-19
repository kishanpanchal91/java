package com.java.core;

public class MI_Interface implements MI_A, MI_B {

	public void print() {
		System.out.println("::::::::::::");
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MI_A b = new MI_Interface();
		b.add(5, 5);
	}
}

interface MI_A {
	public int a = 10;

	void print();

	void add(int a, int b);
}

interface MI_B {
	void print();

}