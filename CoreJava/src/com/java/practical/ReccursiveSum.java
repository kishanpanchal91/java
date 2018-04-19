package com.java.practical;

public class ReccursiveSum {
	int sum=0;
public static void main(String[] args) {
	ReccursiveSum reccursiveSum =new ReccursiveSum();
	System.out.println(reccursiveSum.sum(49));
	
}
public int sum(int a){
	if(a==0) {
		return a;
	}else {
		sum+=(a%10);
		sum(a/10);
	}
	return sum;
}
}
