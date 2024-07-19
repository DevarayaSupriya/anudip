package com.collection;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
tmap.put(31, "Developer");
tmap.put(82, "Tester");
tmap.put(53, "Tech Support");
tmap.put(14, "Data Analyst");
tmap.put(100,"Data base Administrator");
tmap.put(2, "System Architet");
tmap.put(0, "null");
tmap.put(-7, "Programer");
System.out.println(tmap);
System.out.println(tmap.lastKey());

System.out.println(tmap);







	}

}
