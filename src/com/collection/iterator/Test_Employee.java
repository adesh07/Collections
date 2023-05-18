package com.collection.iterator;

public class Test_Employee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setAge(29);
		e1.setId(101);
		e1.setName("dd");
		
		e2.setAge(20);
		e2.setId(102);
		e2.setName("dcd");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1.equals(e2));
			
		}
	}


