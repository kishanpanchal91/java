package com.java.practical;

public class SwapValue {
	public static void main(String[] args) {
		int a = 10, b = 12;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a + ":::::" + b);

	}
}
