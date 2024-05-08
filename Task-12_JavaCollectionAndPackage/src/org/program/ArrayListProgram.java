package org.program;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// List is an index based starts from 0
		// list allows duplicate
		// List is an interface
		// List does not allow data type, it allows wrapper class.
		// List prints in an insertion order

		// Synatx
		// ArrayList<Interger> li1 = new ArrayList<>();
		// Array can be used with similar datatype whereas list allows dissimilar data
		// type in a single word
		// List li1 = new ArrayList();

		// Create an ArrayList of strings
		ArrayList<String> li1 = new ArrayList<>();
		
		// Add some elements to the ArrayList
		li1.add("Apple");
		li1.add("Banana");
		li1.add("Orange");
		li1.add("Grapes");
		li1.add("Cucumber");
		
		// Print the ArrayList before removing elements
		System.out.println("Print the ArrayList before removing the elements " + li1);

		// Remove all elements from the ArrayList
		boolean removeAll = li1.removeAll(li1);

		// Print the ArrayList after removing elements
		System.out.println("Print the ArrayList before removing the elements" + li1);

	}

}
