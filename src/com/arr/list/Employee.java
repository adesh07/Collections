package com.arr.list;

public class Employee {

	private int id;
	private int age;
	private String name;
	
	Employee(int id, String name, int age){
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
		return this.id+" "+this.name+" "+this.age;
	}
}