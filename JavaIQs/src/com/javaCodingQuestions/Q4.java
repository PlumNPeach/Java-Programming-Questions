package com.javaCodingQuestions;

//Find out how many alpha characters are present in a String? Find the number of
//words in a string?
//How many letters in a String? No numbers, no special characters.

public class Q4 {

	public static void main(String[] args) {
		String input = "10/31/23 Halloween";
		
		int alphaCount = input.replaceAll("[^a-zA-Z]", "").length();
		
		System.out.println("alpha char amount: " + alphaCount);
	}
	
}
