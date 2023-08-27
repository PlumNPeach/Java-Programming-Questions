package com.javaCodingQuestions;

//Write a java program to check whether a given number is prime or not?
//Check if a number is divisible by any of smaller numbers. Use the mod operator.

public class Q2 {

	public static void main(String[] args) {
		
		int numInput = 12;
		
		if(isPrime(numInput)) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		
	}
	
	
	static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		
		for(int i = (int)Math.sqrt(num); i > 1; i--) { // check sqrt, it returns valid info of prime or not and is faster
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
