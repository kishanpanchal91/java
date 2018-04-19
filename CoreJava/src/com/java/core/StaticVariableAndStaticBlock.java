package com.java.core;

public class StaticVariableAndStaticBlock {
	//In static block all member must be static otherwise it will given compilation error
	static int a=0;

//Static block always call before main method because
static {
	
	System.out.println("This is Static block"+a);
}

public static void main(String[] args) {
	System.out.println("This is Main Method of"+StaticVariableAndStaticBlock.class);
}
}
