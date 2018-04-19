package com.java.practical;

public class ReverseString {
	String reverse="";
public static void main(String[] args) {
	String str="smit";
	System.out.println(new ReverseString().reverse(str));
}
public  String reverse(String str) {
	if(null!=str && str.length()==1) {
		return str;
	}
	reverse=str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
	return reverse;
	
}
}
