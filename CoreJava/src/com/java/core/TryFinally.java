package com.java.core;

public class TryFinally {

	public static void main(String[] args) {
		
		try {
			int a=5/0;
		}finally {
			System.out.println("Hi this is finally block");
		}

	}

}
