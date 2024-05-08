package org.program;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayProgram {

	public static void main(String[] args) {
	
		List<String> li1 = new ArrayList<>();
		
		li1.add("Samsang");
		li1.add("iphone");
		li1.add("Redmi");
		li1.add("POCO");
		// Convert the list to an array of strings
		String[] array = li1.toArray(new String[0]);
		 // Print the array elements
		System.out.println("Array elements:");
		for (String elements : array) {
			System.out.println(elements);
			
			
		}

	}

}
