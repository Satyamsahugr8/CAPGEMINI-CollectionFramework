package com.java.basicsPractice;

public class CoreJavaRevisionTestCodingQ2Employee {
	int id;
	String firstname;
	String lastname;
	int age;
	int salary;

	public CoreJavaRevisionTestCodingQ2Employee() {
		super();
	}

	public CoreJavaRevisionTestCodingQ2Employee(int id, String firstname, String lastname, int age, int salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id = " + id + ", firstname = " + firstname + ", Lastname = " + lastname + ", age = " + age
				+ ", salary = " + salary + "]";
	}
	public void InorderSalary() {
		
	
	}

}
