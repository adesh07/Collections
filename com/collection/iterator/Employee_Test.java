package com.collection.iterator;

import java.util.ArrayList;
import java.util.Collections;

public class Employee_Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(29, "Radhe", 101);
		Employee e2 = new Employee(22, "Daksh", 111);
		Employee e3 = new Employee(25, "Bhanu", 140);
		Employee e4 = new Employee(27, "Manu", 133);
		Employee e5 = new Employee(22, "Daksh", 111);
		Employee e6 = e1;
		

       ArrayList awp = new ArrayList();
       awp.add(e1);
       awp.add(e2);
       awp.add(e3);
       awp.add(e4);
       awp.add(e5);
       
       System.out.println(awp);
		
		System.out.println(e1 == e6);
		System.out.println(e1.equals(e6));
		
		System.out.println(e5.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e2.equals(e5));
	
		}
	}
