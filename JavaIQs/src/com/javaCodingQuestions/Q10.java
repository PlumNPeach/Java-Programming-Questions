package com.javaCodingQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

// How do you iterate through the hashmap

public class Q10 {
	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("one", 1);
		hashMap.put("two", 2);
		hashMap.put("three", 3);
		hashMap.put("four", 4);
		
		
		//1
		// Using forEach Loop:
		hashMap.forEach((key, value) -> {
			System.out.println("Key: " + key + ", Value: " + value);
		});

		System.out.println();
		
		
		//2
		// Using entrySet():
		for (Entry<String, Integer> entry : hashMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}

		System.out.println();
		
		
		//3
		// Using Iterator:
		Iterator<Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}

		System.out.println();
		
		
		//4
		// Using keySet():
		for (String key : hashMap.keySet()) {
			Integer value = hashMap.get(key);
			System.out.println("Key: " + key + ", Value: " + value);
		}

	}

}
