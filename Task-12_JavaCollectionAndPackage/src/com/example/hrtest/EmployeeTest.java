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
	
public static void main(String[] args) {
		
		// Create an instance of Employee
		Employee e = new Employee("Kaviya", 19091, 28534.00);
		System.out.println(e instanceof Employee);
		
		// Call methods of Employee instance
		e.printName();
		e.printIDNumber();
		e.printSalary();

	}

}
