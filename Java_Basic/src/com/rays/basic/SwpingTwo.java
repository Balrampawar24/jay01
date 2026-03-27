package com.rays.basic;

public class SwpingTwo { 
	
	public static void main(String[] args) {
		
		int a = 25;
		int b = 50;
		
		System.out.println("a = " + a );
		System.out.println("b = " + b );
		
		System.out.println("-----------------");
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
