package com.cg.daythree;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        System.out.println("Enter a Number ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n<=0) {
        	if(n==0) {
        		System.out.println("You entered zero");
        	}
        	else
        	System.out.println("You entered a negative number");
        }
        else{
        	System.out.println("You entered a positive number");
        }
        sc.close();        
        
	}

}
