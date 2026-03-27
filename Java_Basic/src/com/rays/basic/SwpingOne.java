package com.rays.basic;

public class SwpingOne {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c;
		
		System.out.println("a = " + a );
		System.out.println("b = " + b );
		
		
		System.out.println("----------------------");
		
		c = a; // c = 5
		a = b; // a = 10
		b = c; // b = 5
		
		System.out.println("a = " + a );
		System.out.println("b = " + b );
	}

}
