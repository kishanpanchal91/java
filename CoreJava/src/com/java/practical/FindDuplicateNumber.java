package com.java.practical;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber {

	int[] list = { 1, 2, 3, 4, 3, 6, 7 };

	public static int sum(List<Integer> l) {
		int sum = 0;
		for (Integer a : l) {
			sum = sum + a;
		}
		return sum;

	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		for (int a = 1; a < 10; a++) {
			l.add(a);
		}
		l.add(2);

		int highestNumber = l.size() - 1;
		int total = sum(l);
		int duplicate = total - (highestNumber * (highestNumber + 1) / 2);

		System.out.println(duplicate);
	}

}
