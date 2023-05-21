package com.coll.comparator;

import java.util.*;

public class TestEmployee_Comparator {

	public static void main(String[] args) {
		
		Employee_Comparator e1 = new Employee_Comparator(1, "Ram", 29);
		Employee_Comparator e2 = new Employee_Comparator(2, "Shyam", 23);
		Employee_Comparator e3 = new Employee_Comparator(3, "Aadi", 27);
		Employee_Comparator e4 = new Employee_Comparator(4, "Bhanu", 24);
		Employee_Comparator e5 = new Employee_Comparator(5, "Gayak", 25);
		
		ArrayList l1 = new ArrayList();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		
		System.out.println(l1);
		
		Collections.sort(l1, new orderByName());
		for(Object o1 : l1) {
			System.out.println("Sorting by Name : "+o1);
		}
		System.out.println("***************");
		
		Collections.sort(l1, new orderById());
		for(Object o1 : l1) {
			System.out.println("Sorting by Id : "+o1);
		}
		System.out.println("***************");

		Collections.sort(l1, new orderByAge());
		for(Object o1 : l1) {
			System.out.println("Sorting by age : "+o1);
		}
	}
}