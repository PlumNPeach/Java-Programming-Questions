package com.javaCodingQuestions;

//Write a java program to reverse a String? Reverse a string word by word?
//1. Neotech -> hcetoeN
//2. I love Java very much -> much very Java love I

public class Q5 {

	public static void main(String[] args) {
		String inputWord = "Apple";
		String inputSentence = "The apple fell from the tree";
		
		//word solution using -> charAt
		String reversedWord = "";
		for(int i = 1; i <= inputWord.length(); i++) {
			char lastChar = inputWord.charAt(inputWord.length()-i);
			reversedWord += lastChar;
		}
		System.out.println("word solution using -> charAt\n"+reversedWord);
		
		System.out.println();//spacer
		
		//word solution using -> StringBuffer
		String reversedWordSB = "";
		StringBuffer sb = new StringBuffer(inputWord);
		reversedWordSB = sb.reverse().toString();
		System.out.println("word solution using -> StringBuffer\n"+reversedWordSB);
		
		
		System.out.println("\n");//spacer
		
		
		//sentence solution
		String reversedSentence = "";
		String[] words = inputSentence.split(" ");
		for(int i = words.length-1; i >= 0; i--) {
			reversedSentence += words[i] + "\s";
		}
		System.out.println("sentence solution: "+reversedSentence);
	}
	
}
