package com.rays.basic;

public class ArmstrongNo11 {
	
	public static void main(String[] args ) {
		
		int num = 153;
		int r = 0;
		int armstrongNo = 0;
		
		while (num > 0) {
			r = num % 10;
			armstrongNo = armstrongNo + r * r * r;
			num = num / 10;
			
		}
		
		System.out.println(armstrongNo);
	}

}
