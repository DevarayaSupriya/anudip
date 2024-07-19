package com.collection;

import java.util.ArrayDeque;
public class DemoArrayDq {

	public static void main(String[] args) {
ArrayDeque<String> arque=new ArrayDeque<>();
//Adding elements to the ArrayDeque
arque.add("ziya");
arque.add("supriya");
arque.add("kanak");
arque.add("harsha");
System.out.println(arque);
//Removing and peeking elements
System.out.println(arque.poll());
System.out.println(arque.peek());
// Adding elements using different methods
arque.add("bavani");
arque.addFirst("srihitha");
arque.addLast("shravani");
System.out.println(arque);
//Removing a specific element
System.out.println(arque.remove("harsha"));
System.out.println(arque);
// Getting the size of the ArrayDeque
System.out.println(arque.size());
	}

}
