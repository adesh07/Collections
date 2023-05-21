package com.coll.comparator;

import java.util.Comparator;

public class Employee_Comparator {

	private Integer id;
	private String name;
	private Integer age;

	public Employee_Comparator() {
	}

	public Employee_Comparator(int id, String name, int age) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.age;
	}

	public int compare(Employee_Comparator o1, Employee_Comparator o2) {
		return 0;
	}

}

class orderById implements Comparator<Employee_Comparator> {
	public int compare(Employee_Comparator e1, Employee_Comparator e2) {
		return e1.getId().compareTo(e2.getId());
	}
}

class orderByName implements Comparator<Employee_Comparator> {
	public int compare(Employee_Comparator e1, Employee_Comparator e2) {
		return e1.getName().compareTo(e2.getName());

	}
}

class orderByAge implements Comparator<Employee_Comparator> {
	public int compare(Employee_Comparator e1, Employee_Comparator e2) {
		return e1.getAge().compareTo(e2.getAge());
	}
}
