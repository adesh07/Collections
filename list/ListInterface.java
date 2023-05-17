package com.arr.list;

import java.util.ArrayList; 

public class ListInterface {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(0, "Batman");
		al.add(1, 101);
		al.add(2, "Robin");
		al.add(3, 99);
		al.add(4, true);

		System.out.println(al);
		
		System.out.println(al.get(0));
		
		al.remove(4);
		System.out.println(al);
		
		al.set(3, "lol");
		System.out.println(al);
		
		
		System.out.println(al.subList(0, 3)); //from index is inclusive, and to index is exclusive
		
		al.add(4, true);
		System.out.println(al);

		System.out.println(al.indexOf(true));
		
		
		
	}
}
