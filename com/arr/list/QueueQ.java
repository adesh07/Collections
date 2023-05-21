package com.arr.list;

import java.util.*;

public class QueueQ {
	
	public static void main(String[] args) {
		
		Queue q1 = new LinkedList();
		
		q1.add("A1");
		q1.add("A2");
		q1.add("A3");
		q1.offer("O1");
		q1.offer("O2");
		q1.offer("O3");
		
//		q1.remove();     [remove and poll works same (just removes the head of the queue)]
//		q1.poll();
		
		//System.out.println(q1.element());
		//System.out.println(q1.peek());
		
		System.out.println(q1);
		
		
	}
	
}
