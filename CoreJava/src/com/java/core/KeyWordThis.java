package com.java.core;

public class KeyWordThis {

	public KeyWordThis() {
      //always call parameterized constructor and it is for parameterized constrouctor only
		this(10);
       System.out.println("This is default constructor");
	}
	
	public KeyWordThis(int a) {
	  System.out.println("This is parameterized constructor :"+ a);
	}
	
	public static void main(String[] args) {
		KeyWordThis keyWordThis=new KeyWordThis();
		int q=0;
		while(q<10) {
			q++;
		    System.out.println(q);
		    }
	}
	
}
