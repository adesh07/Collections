package com.arr.list;

import java.util.*;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put(null, null);
		hm.put(0, 0.5);
		hm.put("1", "one");
		hm.put("2", "two");
		hm.put("3", "three");
		hm.put("4", "four");
		hm.put("5", "five");
		
//		System.out.println(hm);
//		
//		hm.remove("3");
//		hm.remove(0);
//		System.out.println(hm);
		
		Set key = hm.keySet();
		for(Object k : key) {
			System.out.println(k);
			
			Set keyValue = hm.entrySet();
			for(Object ele : keyValue) {
				Map.Entry pair = (Map.Entry) ele;
				System.out.println(pair.getKey()+"-"+pair.getValue());
			}
		}
	}
}
