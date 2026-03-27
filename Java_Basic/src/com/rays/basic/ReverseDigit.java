package com.rays.basic;

public class ReverseDigit {
	

	    public static int reverseDigits(int num) {
	        long reversedNum = 0;
	        long tempNum = num;
	        
	        // Handle negative numbers by working with the absolute value initially
	        boolean isNegative = tempNum < 0;
	        if (isNegative) {
	            tempNum = -tempNum;
	        }

	        while (tempNum > 0) {
	            long digit = tempNum % 10;
	            reversedNum = reversedNum * 10 + digit;
	            tempNum /= 10;
	        }

	        // Reapply the negative sign if necessary
	        if (isNegative) {
	            reversedNum = -reversedNum;
	        }

	        // Check for overflow before casting back to int
	        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
	            return 0; // Or throw an exception
	        }

	        return (int) reversedNum;
	    }

	    public static void main(String[] args) {
	        int number = 12345;
	        int reversedNumber = reverseDigits(number);
	        System.out.println("Original number: " + number);
	        System.out.println("Reversed number: " + reversedNumber);

	        int numberNeg = -67890;
	        int reversedNumberNeg = reverseDigits(numberNeg);
	        System.out.println("Original number: " + numberNeg);
	        System.out.println("Reversed number: " + reversedNumberNeg);
	    }
	}


