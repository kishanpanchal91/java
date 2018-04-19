package com.java.core;

import java.util.stream.IntStream;

public class InstreamFun {

	public static void main(String[] args) {
		// IntStream.range(0,studentlist.size()).forEach(i->studentlist.get(i).getName().equals(id) ? 0 : null);
		
		IntStream.range(0, 10).forEach(i -> System.out.println(i));

	}

}
