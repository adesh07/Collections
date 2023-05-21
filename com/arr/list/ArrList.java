package com.arr.list;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(01, "Amar", 23);
		Employee e2 = new Employee(02, "Akhbar", 24);
		Employee e3 = new Employee(03, "Athony", 25);

//        System.out.println(e1);
//        System.out.println(e2);
//        System.out.println(e3);		

        
        ArrayList list = new ArrayList();
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        
        System.out.println(list);
        System.out.println(list.get(2));   
        
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        System.out.println(e3.getName());
        
        }        
	}

