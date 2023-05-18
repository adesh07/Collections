package com.collection.iterator;

import java.util.*;

public class IteratorC {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(101);
		list.add("Goku");
		list.add(true);
		list.add(777.999);
		list.add('Z');
		 
		 Iterator it = list.iterator();
		 
		// list.add("new value");   // cannot add values after iteration process.
		 
		 System.out.println("hasNext : "+it.hasNext());
		 
		 while(it.hasNext()) {
			 
//			 Employee e = (Employee)it.next();
//			 System.out.println(e.getAge());
//			 System.out.println(e.getId());
//			 System.out.println(e.getName());
			 
			 System.out.println(it.next());
			 
			 it.remove();   // list is empty after this statement
		
		 }		 
	}
}
