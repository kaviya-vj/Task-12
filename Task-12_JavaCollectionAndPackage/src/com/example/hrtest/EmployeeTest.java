package com.example.hrtest;

import com.example.hr.*;

public class EmployeeTest {

	// public, private, protected is a access specifier
	// static is a keyword
	// main() is a method name
	// String/System is a class
	// void is the return type of the given method/keyword
	// () means arguments
	// {} body of the method or block
	// "" String(predefined class)
	
	public void empName() {
		System.out.println("Employee name is Durga");
	}

	public void empID() {
		System.out.println("Employee ID number is 213456");
	}

	public void empSalary() {
		System.out.println("Employee salary is 355000.25");
	}

	public static void main(String[] args) {

		// Create an instance of EmployeeTest
		EmployeeTest et = new EmployeeTest();
		// Call methods of EmployeeTest instance
		et.empName();
		et.empID();
		et.empSalary();

		// Create an instance of Employee
		Employee e = new Employee();
		// Call methods of Employee instance
		e.printName();
		e.printIDNumber();
		e.printSalary();

	}

}
