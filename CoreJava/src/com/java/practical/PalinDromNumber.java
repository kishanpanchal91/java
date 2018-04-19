package com.java.practical;

import java.io.IOException;
import java.util.Scanner;

public class PalinDromNumber {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String str = String.valueOf(number);

		// Method 1

		StringBuffer buffer = new StringBuffer(str);
		System.out.println(" Method 1 Pelindrome Number :" + (buffer.reverse().toString().equals(str)));

		// Method 2
		int len = str.length() - 1;
		String str2 = str;
		boolean result = false;
		for (int i = 0; i < len; i++) {
			if (!(str.charAt(i) == str2.charAt(len))) {
				break;
			}
			result=true;
			len--;
		}
		if (result) {
			System.out.println(" Method 2 This is Palindrome Number :" + number);
		} else {
			System.out.println(" Method 2 Invalid Palindrome Number :" + number);
		}
		
		//Method 3
		String reverse="";
		int length = str.length()-1;
		for(int i=length;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(str.equals(reverse)?" Method 3 Palindrome Number":" Method 3 Invalid Palindrome");
		
		
		//Method 4
		int temp;
		int sum = 0;
		int num=number;
		while(num!=0) {
			temp=num%10;
			sum=sum*10+temp;
			num=num/10;
		}
		System.out.println(" Method 4 Pallindrome :"+(sum==number));
		
	}

}
