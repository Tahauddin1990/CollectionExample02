package com.durgasoft.collection;

import java.util.TreeSet;

public class TreeSetDemo2 {
	
	private static ComparatorExample2 comparatorExample2;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		setComparatorExample2(new ComparatorExample2());	
		TreeSet<StringBuffer> treeSet = new TreeSet<StringBuffer>(getComparatorExample2());
		treeSet.add(new StringBuffer("Syed"));
		treeSet.add(new StringBuffer("Mohd"));
		treeSet.add(new StringBuffer("Abdul"));
		treeSet.add(new StringBuffer("Mirza"));
		treeSet.add(new StringBuffer("Khan"));
		System.out.println(treeSet);
	}

	public static ComparatorExample2 getComparatorExample2() {
		return comparatorExample2;
	}

	public static void setComparatorExample2(ComparatorExample2 comparatorExample2) {
		TreeSetDemo2.comparatorExample2 = comparatorExample2;
	}

}
