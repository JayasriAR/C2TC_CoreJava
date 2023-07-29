package com.cg.day2.basics;

import java.util.Scanner;

public class Switchcas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		x=sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("you  entered 1");
			break;
		default:
			System.out.println("default case");
			break;
		}
		sc.close();
	}


}
