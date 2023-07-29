package com.cg.day3;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        System.out.println("Enter a Number ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        char c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Character ");
        c=s.nextLine().charAt(0);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter String ");
        String a;
        a=sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a Long int ");
        long d;
        d=sc2.nextLong();
   
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
        s.close();
        sc1.close();
        sc2.close();
        
	}

}
