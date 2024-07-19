package com.collection;
import java.util.TreeMap;
public class Treemap {

	public static void main(String[] args) {
		 // Create a new TreeMap named stuMap that maps Integer keys to Student objects.
		TreeMap<Integer, Student> stuMap = new TreeMap<Integer,Student>();
		 // Inserting student objects into the TreeMap
		 
	        stuMap.put(1, new Student(1, "kanak", "Computer Science"));
	        stuMap.put(2, new Student(2, "Harsha", "Mathematics"));
	        stuMap.put(3, new Student(3, "shravani", "Biology"));
	        stuMap.put(4, new Student(4, "Bavani", "physics"));
	        stuMap.put(5, new Student(5, "shivani", "Chemistry"));
	     // Printing the entire TreeMap
	        System.out.println(stuMap);
	     // Checking if the TreeMap is empty
	        System.out.println(stuMap.isEmpty());
	        // Checking if the TreeMap contains a key
	        System.out.println(stuMap.containsKey(4));
	     // Checking if the TreeMap contains a value (this won't work directly as intended)
	        System.out.println(stuMap.containsValue("physics"));
	        System.out.println(stuMap);
	     // Printing the size of the TreeMap
	        System.out.println(stuMap.size());
	     // Retrieving and printing the first key in the TreeMap
	        System.out.println(stuMap.firstKey());
	        // Retrieving and printing the key that is higher than 3 (in this case, 4)
	        System.out.println(stuMap.higherKey(3));
	     // Retrieving and printing the key that is lower than 2 (in this case, 1)
	        System.out.println(stuMap.lowerKey(2));
	        System.out.println(stuMap);
	}

}
