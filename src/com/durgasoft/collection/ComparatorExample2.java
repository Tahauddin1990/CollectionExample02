package com.durgasoft.collection;

import java.util.Comparator;

public class ComparatorExample2 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int val = 0;
	//	val = s1.compareTo(s2);   this is same as the next line
		val = -s2.compareTo(s1);   // comparing s2 with s1.
		return val;
	}
}
