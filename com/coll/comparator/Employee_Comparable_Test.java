package com.coll.comparator;

import java.util.Collections;
import java.util.ArrayList;

public class Employee_Comparable_Test {


		public static void main(String[] args) {

			Employee_Comparable t1 = new Employee_Comparable(7, "Pudge", 21);
			Employee_Comparable t2 = new Employee_Comparable(4, "Jugg", 22);
			Employee_Comparable t3 = new Employee_Comparable(6, "Ogre", 27);
			Employee_Comparable t4 = new Employee_Comparable(2, "Jugg", 22);
			Employee_Comparable t5 = new Employee_Comparable(1, "Puck", 25);

			ArrayList al = new ArrayList();
			al.add(t1);
			al.add(t2);
			al.add(t3);
			al.add(t4);
			al.add(t5);
			
			System.out.println(al);
			
			System.out.println("size : "+al.size());
			
			System.out.println(t2.hashCode());
			System.out.println(t4.hashCode());
			
			
			System.out.println(t2.equals(t4));
			
			System.out.println(t2.compareTo(t4));
			
			Collections.sort(al);
			
			for(Object it : al) {
				System.out.println(it);
			}
			

		}
}
