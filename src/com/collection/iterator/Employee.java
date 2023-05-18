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
	
	public boolean equals(Object ob) {
		
		if (ob == null) 
			return false;
		if( ! (ob instanceof Employee))
			return false;
		Employee other = (Employee) ob;
		return (this.name.equals(other.name) && this.age.equals(other.age) && this.id.equals(other.id));
	}

	public int hashCode() {

		return name.hashCode() + age.hashCode() + id.hashCode();
		//above statement adds hashCode(integer value) of age+id+name;
	}
}