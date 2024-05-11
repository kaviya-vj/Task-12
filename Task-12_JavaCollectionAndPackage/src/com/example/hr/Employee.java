package com.example.hr;

public class Employee {
	
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void printName() {
		System.out.println("Employee name is "+ name);		
	}

	public void printSalary() {
		System.out.println("Employee salary is "+salary);
		
	}

	public void printIDNumber() {
		System.out.println("Employee ID Number is "+ id);
	}



}
