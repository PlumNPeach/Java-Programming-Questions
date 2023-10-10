package com.javaCodingQuestions;

/*Write a code which will return true or false. You have an Integer value e.g. "123456". 
		Return true if the ending 2 digits are between 1-25.
		Otherwise return false.
*/

public class Q9 {
	
	public static boolean checkLastTwoDigits(int number) {
        int lastTwoDigits = number % 100;
        return lastTwoDigits >= 1 && lastTwoDigits <= 25;
    }
	
    public static void main(String[] args) {
        int inputNumber = 123401;
        boolean result = checkLastTwoDigits(inputNumber);
        System.out.println(result);
    }
    
}
