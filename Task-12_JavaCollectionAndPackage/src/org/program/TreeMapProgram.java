package org.program;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapProgram {

	public static void main(String[] args) {
TreeMap <Integer, String> mp1 = new TreeMap<>();
		mp1.put(104, "Sachin");
		mp1.put(103, "Dhoni");
		mp1.put(105, "Raghul");
		mp1.put(101, "John");
		mp1.put(102, "Nick");
		// treemap print the output in ascending order based on the key value
		System.out.println(mp1);
	
		System.out.println("Print the name of all the employee in alphabetical order:");
		
		// Creating a TreeSet to store values in alphabetical order
		TreeSet<String> names = new TreeSet<>(mp1.values());
	
		for (String as : names) {
			System.out.println(as);
		}
	}
	
	
	
	}


