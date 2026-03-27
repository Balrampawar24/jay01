package com.rays.basic;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: " + 12121212);
        int originalNumber = scanner.nextInt();
        scanner.close();

        // Calling the method to check if it's a palindrome
        if (isPalindrome(originalNumber)) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }

    // This is the missing logic you need to add
    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            reverse = (reverse * 10) + remainder;
            temp = temp / 10;
        }

        return number == reverse;
    }
}