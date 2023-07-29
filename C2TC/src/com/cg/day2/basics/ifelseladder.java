package com.cg.daytwo.basics;

import java.util.Scanner;

public class ifelseladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks ");
		x=sc.nextInt();
		if(x>90) {
			System.out.println("First class");
		}
		else if(x<90 && x>70) {
			System.out.println("Second class");
		}
		else {
			System.out.println("Failed");
		}
		

	}

}
