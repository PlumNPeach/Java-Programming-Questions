package com.javaCodingQuestions;

//Find out how many alpha characters are present in a String? Find the number of
//words in a string?
//How many letters in a String? No numbers, no special characters.

public class Q4 {

	public static void main(String[] args) {
		//find number of letters
		String input = "10/31/23 Halloween";
		
		int alphaCount = input.replaceAll("[^a-zA-Z]", "").length();  //first way
		
		System.out.println("alpha char amount: " + alphaCount);
		
		
		//second way
		int alphaCount2 = 0;
		for(char eachlet : input.toCharArray()) {
			if(Character.isLetter(eachlet)) {
				alphaCount2++;
			}
		}
		
		System.out.println("alpha char amount: " + alphaCount2);
		
		
		
		
		//find number of words
		String inputSentence = "The dog walked in the park";
		String[] words = inputSentence.split(" ");
		int wordCount = 0;
		
		for(int i = 0; i < words.length; i++) {
			wordCount++;
		}
		
		System.out.println("word count: " + wordCount);
	}
	
}
