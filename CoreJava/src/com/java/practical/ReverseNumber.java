package com.java.practical;


public class ReverseNumber {
public static void main(String[] args) {
	int a=120;
	ReverseNumber number=new ReverseNumber();
	
	int b=0;
	while(a!=0) {
		b=(b*10)+(a%10);
		a=a/10;
	}
	System.out.println(number.reverse(12));
	System.out.println(b);
}
public int reverse(int a) {
	
	return a;
}
}
