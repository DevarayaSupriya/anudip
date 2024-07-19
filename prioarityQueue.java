package com.collection;

import java.util.PriorityQueue;

public class prioarityQueue {

	
			public static void main(String[] args) {
				PriorityQueue<String> pq = new PriorityQueue<>();
				// Adding elements to the PriorityQueue
		pq.add("harsha");
		pq.add("supriya");
		pq.add("ziya");
		// Printing the PriorityQueue
		System.out.println("priority Queue:"+pq);
		// Peek and Poll operations
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		 // Size of the PriorityQueue
		System.out.println(pq.size());
		System.out.println(pq);
		 // Offer operation (adding an element)
		System.out.println(pq.offer("kanak"));
		// Checking if the PriorityQueue is empty
		System.out.println(pq.isEmpty());
			}

			
		


	}


