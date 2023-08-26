package com.javaCodingQuestions;

//Write a Java Program to find whether a String is palindrome or not?
//Palindrome a word, phrase, or sequence that reads the same backward as forward.
//radar yes; baba no; kayak yes; madam yes;

public class Q6 {

	public static void main(String[] args) {
		String inputWord = "Plumulp";
		int inputNum = 1551;
		
		if(isPalindrome(inputWord)) {
			System.out.println("the word is a palindrome");
		}else {
			System.out.println("the word is not a palindrome");
		}
		
		
		if(isPalindrome(inputNum)) {
			System.out.println("the number is a palindrome");
		}else {
			System.out.println("the number is not a palindrome");
		}
	}
	
	
	
	
	// for strings
	static boolean isPalindrome(String word){
		word = word.toLowerCase(); 
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
		
	}

	
	
	
	
	// for ints
	static boolean isPalindrome(int num){
	    int holder = num;
	    int reversedNum = 0;

	    while(num > 0) {
	      int digit = num % 10;
	      reversedNum = reversedNum * 10 + digit;
	      num /= 10;
	    }

	    if(holder == reversedNum) {
	      return true;
	    }else {
	      return false;
	    }
	    
	}
}
