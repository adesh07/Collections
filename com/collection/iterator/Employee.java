package com.collection.iterator;

public class Employee {

	private Integer id;
	private String name;
	private Integer age;

	public Employee() {
	}

	public Employee(int id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
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

	public int getAge() {
		return age;
	}
	
	public String toString() {
		return this.id.toString()+" "+this.name.toString()+" "+this.age.toString();
	}
	
	public boolean equals(Object ob) {
		Employee emp = (Employee) ob; 
		return (this.name.equals(emp.name) && this.age.equals(emp.age) && this.id.equals(emp.id));
	}

	public int hashCode() {
		return name.hashCode() + age.hashCode() + id.hashCode();
		//above statement does addition of hashCodes(integer value) of age+id+name;
	}
}