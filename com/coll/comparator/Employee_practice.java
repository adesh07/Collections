package com.coll.comparator;

import java.lang.Comparable;

	public class Employee_practice implements Comparable<Employee_practice>{

		private Integer id;
		private Integer age;
		private String name;
		
		public Employee_practice() {}
		
		public Employee_practice(int id, String name, int age) {
			this.age = age;
			this.name = name;
			this.id = id;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String toString() {
			return this.age.toString()+" "+this.name.toString()+" "+this.id.toString();
		}
//		public boolean equals(Object o) {
//			Test_01 tst = (Test_01)o;
//			return this.age.equals(tst.age)&&this.id.equals(tst.id)&&this.name.equals(tst.name);
//		}
		public int hashCode() {
			return this.age.hashCode()+this.id.hashCode()+this.age.hashCode();
		}
		
		public boolean equals(Object olo) {
			if(olo == null)
				return false;
			if(!(olo instanceof Employee_practice))
				return false;
			
			Employee_practice tyt = (Employee_practice)olo;
			
			if(this.name == tyt.name && this.age == tyt.age && this.id.intValue() == tyt.id.intValue()) {
				return true;
			}
			else
				return false;
		} 
		public int compareTo(Employee_practice wew) {
			
			if(this.name == wew.name && this.age == wew.age) {
			return this.id.compareTo(wew.id);
			}else 
				return this.age.compareTo(wew.age);
			
		}
	}


