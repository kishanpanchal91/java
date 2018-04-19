package com.java.practical;

public class FiveLargestValue {
	public static void main(String[] args) {
		int first, second, third, fourth, five;
		first = second = third = fourth = five = 0;
		int[] a = { 1, 6, 7, 8, 0,100,12,16};
		
		System.out.println("Largest five Numbers");

		for (int i = 0; i < a.length; i++) {
			if (a[i] > first) {
				five = fourth;
				fourth = third;
				third = second;
				second = first;
				first = a[i];
			} else if (a[i] > second & first != 0) {
				five = fourth;
				fourth = third;
				third = second;
				second = a[i];

			} else if (a[i] > third & first != 0 & second!=0) {
				five = fourth;
				fourth = third;
				third = a[i];
				
			} else if (a[i] > fourth & first != 0 & second!=0 & third!=0) {
				five = fourth;
				fourth = a[i];

			}else if (a[i] > second & first != 0 & second!=0 & third!=0 & fourth!=0) {
				five = a[i];
			}
			
		}
		
		System.out.println("Largest Number is " + first +" "+second+" "+third+" "+fourth+" "+five);

	}

}
