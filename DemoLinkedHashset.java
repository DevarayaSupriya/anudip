package com.collection;
import java.util.LinkedHashSet;

public class DemoLinkedHashset {

	public static void main(String[] args) {
LinkedHashSet<String> Names=new LinkedHashSet<String>();
//Adding elements to the LinkedHashSet
Names.add("supriya");
Names.add("kanak");
Names.add("Harsha");
Names.add("bavani");
System.out.println(Names);
// Adding a null element
Names.add(null);
// Adding a duplicate element
Names.add("kanak");
//Checking if "shravani" is present
System.out.println(Names.contains("shravani"));
//Size of the LinkedHashSet
System.out.println(Names.size());
//Hash code of the LinkedHashSet
System.out.println(Names.hashCode());
// Checking if the LinkedHashSet is empty
System.out.println(Names.isEmpty());
System.out.println(Names);

	}

}
