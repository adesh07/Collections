package com.collection.iterator;

import java.util.*;

public class Enumuratn {
	
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		vec.add('X');
		vec.add(111);
		vec.add("Enum");
		vec.add(55.123);
		vec.add(false);
		
		Enumeration en = vec.elements();
		
		vec.add("Krish");
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
