package com.cg.day2.basics;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
	System.out.println("--------------------------while loop-------------------------");
	int n=0;
	while(n<10) {
		System.out.println("value of n "+n);
		n++;
	}
	System.out.println("--------------------------do while loop-------------------------"); 
	Scanner sc = new Scanner(System.in);
	char c;
	do {
		System.out.println("Warning!!!");
		System.out.println("Do you want to see this Warning again? (y/n) ");
		c = sc.next().charAt(0);	
	}while(c=='y');
	sc.close();
	}
}
