package com.javaCodingQuestions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

//How can you remove all duplicates from ArrayList?
//You can create a new ArrayList and add the values one by one, checking if the
//object exists or not. You can also use a Set.

public class Q8 {
	public static void main(String[] args) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(1);
		newList.add(1);
		newList.add(4);
		newList.add(4);
		newList.add(7);
		newList.add(7);
		newList.add(3);
		newList.add(3);
		newList.add(11);
		newList.add(11);
		newList.add(5);
		newList.add(5);
		
		
		Set<Integer> newSet = new LinkedHashSet<Integer>(newList); // put list into set, automatically removes duplicates
		
		System.out.println(newSet);
	}
}
