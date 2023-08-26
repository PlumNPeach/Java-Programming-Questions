package com.javaCodingQuestions;

//Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
//without a temporary variable?
//int a = 5;
//int b = 10;
//At the end, the value of b will be 5 and the value of a will be 10.
//You can add them together and remove them from each other.

public class Q1 {

	public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a - " + a);
        System.out.println("b - " + b);

        
        
        String s1 = "Hello";
        String s2 = "World";

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("str1 - " + s1);
        System.out.println("str2 - " + s2);
    }
	
}
