package com.durgasoft.collection1;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {

		TreeSet treeSet = new TreeSet(new ComparatorImplementation());
		treeSet.add("A");
		treeSet.add("BB");
		treeSet.add(new StringBuffer("AA"));
		treeSet.add(new StringBuffer("BBB"));
		treeSet.add("CCC");
		treeSet.add(new StringBuffer("CC"));
		System.out.println(treeSet);
	}
}
