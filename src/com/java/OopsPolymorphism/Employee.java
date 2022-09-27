package com.java.OopsPolymorphism;

public class Employee {

	    String name;
	    int salary;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public Employee(String name, int salary) {
			super();
			this.name = name;
			this.salary = salary;
		}
	    
	    

}
