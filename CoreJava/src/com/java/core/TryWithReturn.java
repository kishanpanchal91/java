package com.java.core;

public class TryWithReturn {
	public static void main(String[] args) {
        System.out.println(print());
        String a="12";
        String b=new String("12");
        System.out.println(a==b);
        System.out.println(a.equals(b));
	}

	public static String print() {
		try {
			return "This is from try";
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return "This is from finally";
		}

	}
	
	
	
}
