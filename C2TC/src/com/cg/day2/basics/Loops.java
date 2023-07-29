package com.cg.day2.basics;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		System.out.println("--------------------------for each loop-------------------------");
		//used only for array or collections
		int a[]= {434,39,35,34,26};
		for(int i:a)
			System.out.println(i);

	
	System.out.println("--------------------------for loop-------------------------");
	int sum=0;
	for(int i=1;i<10;i++) {
		sum+=i;
	}
	System.out.println("Sum of numbers from 1 to 10"+sum);

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
