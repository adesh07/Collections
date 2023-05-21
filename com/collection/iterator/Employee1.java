package com.collection.iterator;

import java.lang.Comparable;

public class Employee1 implements Comparable<Employee1> {

	private Integer id;
	private Integer age;
	private String name;

	public Employee1() {
	}

	public Employee1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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

	public boolean equals(Object o) {
		if (o == null) {
			System.out.println("if-1");
			return false;
		}
		if (!(o instanceof Employee1)) {
			System.out.println("if-2");
			return false;
		}
		Employee1 e = (Employee1) o;
		if (this.name == e.name && this.id == e.id && this.age.intValue() == e.age.intValue())
			return true;
		else
			return false;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.age;
	}

	public int compareTo(Employee1 emp) {
		if (this.id == emp.id && this.name == emp.name) {
			return this.age.compareTo(emp.age);
		} else {
			return this.id.compareTo(emp.id);
		}
	}

}
