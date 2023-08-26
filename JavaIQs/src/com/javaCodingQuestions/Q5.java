package com.javaCodingQuestions;

//Write a java program to reverse a String? Reverse a string word by word?
//1. Neotech -> hcetoeN
//2. I love Java very much -> much very Java love I

public class Q5 {

	public static void main(String[] args) {
		
		String inputWord = "Apple";
		String inputSentence = "The apple fell from the tree";
		
		
		
		String wordResult = "";
		for(int i = 1; i <= inputWord.length(); i++) {
			char lastChar = inputWord.charAt(inputWord.length()-i);
			wordResult += lastChar;
		}
		System.out.println(wordResult);
		
		
		
		String sentenceResult = "";
		String[] words = inputSentence.split(" ");
		for(int i = words.length-1; i >= 0; i--) {
			sentenceResult += words[i] + "\s";
		}
		System.out.println(sentenceResult);
	}
	
}
