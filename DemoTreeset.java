package com.collection;

import java.util.TreeSet;

public class DemoTreeset {

	public static void main(String[] args) {
TreeSet<String> t=new TreeSet<String>();
// Adding elements to the TreeSet
t.add("Indore");
t.add("Surat");
t.add("Mumbai");
t.add("Bopal");
t.add("Visakapatnam");
System.out.println(t);
// Size of the TreeSet
System.out.println(t.size());
//Checking if an element is present
System.out.println(t.contains("Surat"));
// Retrieving the first element
System.out.println(t.first());
//Retrieving the greatest element less than "Bopal"
System.out.println(t.lower("Bopal"));
//Retrieving the smallest element greater than "Mumbai"
System.out.println(t.higher("Mumbai"));
//Retrieving the last element
System.out.println(t.last());
//Printing the TreeSet in descending order
System.out.println(t.descendingSet());
System.out.println(t);



	}

}
