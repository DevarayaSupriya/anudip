package com.collection;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
	public static void main(String []args) {
		// Creating an ArrayList named 'list' to store elements
		 ArrayList list=new ArrayList();
	        // Adding various elements to the ArrayList

   list.add(10);
   list.add(20);
   list.add(30);
   list.add('a');
   list.add(3.14);
   list.add("supriya");
   list.add(20);
   list.add('a');
   System.out.println(list);
   // Adding more elements to the ArrayList
   list.add(true);
   list.add(1,2);
// Adding null to the ArrayList
   list.add(null);
   System.out.println(list);
   // Replacing element at index 2 with integer 4
   list.set(2, 4);
   System.out.println(list);
   // Removing element at index 9 (which is null in this case)
   list.remove(9);
   // Checking if the ArrayList contains integer 2
   System.out.println(list.contains(2));
   // Finding the last index of integer 20
   System.out.println(list.lastIndexOf(20));
   // Finding the first index of character 'a'
  System.out.println(list.indexOf('a'));
  // Getting element at index 0
  System.out.println(list.get(0));
  // Getting the size of the ArrayList
  System.out.println(list.size());
//Removing the string "supriya" from the ArrayList
  System.out.println(list.remove("supriya"));
  System.out.println(list);
//Removing the string "supriya" from the ArrayList
  System.out.println(list.isEmpty());
  // Adding elements 1 and 2 to ArrayList 'L'
  ArrayList L=new ArrayList();
  System.out.println(L.isEmpty());
  L.add(1);
  L.add(2);
  // Adds all elements from 'list' to 'L'
 L.addAll(list);
  System.out.println(L);
  // Creating a generic ArrayList 'arrlist' to store integers
   List <Integer>arrlist=new ArrayList<Integer>();   
   }
   
   }
