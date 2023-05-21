package com.coll.comparator;

import java.util.Collections;
import java.util.ArrayList;

public class EmpPracetice_test {


		public static void main(String[] args) {

			Employee_practice t1 = new Employee_practice(777, "Pudge", 21);
			Employee_practice t2 = new Employee_practice(4487, "Jugg", 22);
			Employee_practice t3 = new Employee_practice(699, "Ogre", 27);
			Employee_practice t4 = new Employee_practice(4487, "Jugg", 22);
			Employee_practice t5 = new Employee_practice(1996, "Puck", 25);

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
