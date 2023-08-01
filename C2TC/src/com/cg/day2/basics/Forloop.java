package com.cg.day2.basics;

public class Forloop {

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
	}

}
