package com.javaCodingQuestions;

//Write a java program to find the second largest number in the array? Maximum
//and minimum number in the array?
//Do it in one iteration.

public class Q7 {
	public static void main(String[] args) {
		int[] newIntArr = {4,1,5,2,6,9,8,7};
		int largestValue = Integer.MIN_VALUE;
		int secondLargestValue = Integer.MIN_VALUE;
		int smallestValue = Integer.MAX_VALUE;

		for (int num : newIntArr) {
		    if (num > largestValue) {
		        secondLargestValue = largestValue;
		        largestValue = num;
		    } else if (num > secondLargestValue && num != largestValue) {
		        secondLargestValue = num;
		    }

		    if (num < smallestValue) {
		        smallestValue = num;
		    }
		}
		
		System.out.println("largest value: "+largestValue);
		System.out.println("second largest value: "+secondLargestValue);
		System.out.println("smallest value: "+smallestValue);
	}
}
