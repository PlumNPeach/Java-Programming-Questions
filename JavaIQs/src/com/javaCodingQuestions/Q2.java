package com.javaCodingQuestions;

//Write a java program to check whether a given number is prime or not?
//Check if a number is divisible by any of smaller numbers. Use the mod operator.

public class Q2 {

	public static void main(String[] args) {
		
		int numInQuestion = 16;
		
		if(isPrime(numInQuestion)) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		
	}
	
	
	static boolean isPrime(int num) {
		for(int i = num-1; i > 1; i--) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
