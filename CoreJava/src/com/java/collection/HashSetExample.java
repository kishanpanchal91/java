package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
public static void main(String[] args) {
	Set set=new HashSet<>();
	set.add("ABC");
	System.out.println(set.add("ABC"));
	System.out.println(set.add("BCD"));
	 System.out.println(set.add(null));
	 System.out.println(set.add(null));
}
}
