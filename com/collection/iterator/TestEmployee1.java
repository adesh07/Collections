package com.collection.iterator;

import java.util.Collections;
import java.util.ArrayList;

public class TestEmployee1 {

	public static void main(String[] args) {
		
		Employee1 em1 = new Employee1(1, "Radhe", 27);
		Employee1 em2 = new Employee1(2, "Shyam", 23);
		Employee1 em3 = new Employee1(3, "Aadi", 25);
		Employee1 em4 = new Employee1(4, "Bhanu", 26);		
		Employee1 em5 = new Employee1(2, "Shyam", 23);
		
		
		ArrayList al = new ArrayList();
		al.add(em1);
		al.add(em2);
		al.add(em3);
		al.add(em4);
		al.add(em5);
		
		
		System.out.println(em2.equals(em5));
		
		//System.out.println(em2.compareTo(em5));  // compareTo() method works within Collections.sort() method
		
		Collections.sort(al);
		
		for(Object ele : al) {
			System.out.println(ele);
		}
		
	}
}
