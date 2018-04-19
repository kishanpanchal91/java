package com.java.core;

public class MethodOverloading {
/*
	static int add(int a, int b) {
		  return a+b;
	}*/

	static int add(int a, long b) {
		  return (int) (a+b);
	}

	static int add(long a, int b) {
     return (int) (a+b);
	}

	public static void main(String[] args) {
     // System.out.println(add(10,10));
	}
}
