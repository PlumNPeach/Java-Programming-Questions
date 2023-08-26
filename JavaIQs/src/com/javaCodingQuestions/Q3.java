package com.javaCodingQuestions;

import java.util.ArrayList;

//Write a Java Program to print the first 10 numbers of Fibonacci series.
//Fibonacci series: The next number is the sum of two previous numbers
//You have to print -> 1,1,2,3,5,8,13,21,34,55...

public class Q3 {

	public static void main(String[] args) {
		System.out.println(getFibNumbers(10));
	}
	
	
	static ArrayList<Integer> getFibNumbers(int amount) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int num1 = 0;
		int num2 = 1;

		//numList.add(num1);	//zeroth position print if you want
		
		for(int i = 0; i < amount; i++) {
			
			int holder = num2;
			num2 = num1 + num2;
			num1 = holder;
			
			numList.add(num1);
			
		}
		System.out.println(num1);
		return numList;
	}
}
