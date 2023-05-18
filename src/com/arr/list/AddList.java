package com.arr.list;

import java.util.ArrayList;

public class AddList {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add("Red");
		list1.add(120);
		list1.add("Rose");
		
		
		ArrayList list2 = new ArrayList();
		list2.add("Gold");
		list2.add(320);
		list2.add("Silver");
		list2.add("Gold");
		
		list1.add(list2);
		System.out.println("list 1 : "+list1);
		System.out.println("list 1 (size) : "+list1.size());
		
		System.out.println();
		
		list1.addAll(list2);
		//System.out.println("list 2 : "+list2);
		System.out.println("list 1 : "+list1);
		System.out.println("list 1 (size) : "+list1.size());
		
		System.out.println();
		
		list2.clear();
		System.out.println("list 2 : "+list2);
		System.out.println("list 2 (size) : "+list2.size());
		
		System.out.println();
		
		System.out.println(list1.contains("Gold"));
		System.out.println(list2.isEmpty());
		
		System.out.println();
		
		list1.removeAll(list2);
		System.out.println("List 1 : "+list1);
		list1.remove(3);
		System.out.println("List 1 : "+list1);

		System.out.println();
        
		
	}
}
