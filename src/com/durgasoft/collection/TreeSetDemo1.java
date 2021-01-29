package com.durgasoft.collection;

import java.util.TreeSet;

public class TreeSetDemo1 {
	
	public static void main(String[] args) {

		ComparatorExample1 comparatorExample1 = new ComparatorExample1();	
		TreeSet<String> treeSet = new TreeSet<String>(comparatorExample1);
		treeSet.add("Syed");
		treeSet.add("Mohd");
		treeSet.add("Abdul");
		treeSet.add("Mirza");
		treeSet.add("Khan");
		System.out.println(treeSet);
	}

}
