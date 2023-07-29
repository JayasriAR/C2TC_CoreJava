package com.cg.daytwo.basics;

public class Nestefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Floyd triangle 3 multiple ");
        int n=10,a=1;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print(a++*3+" ");
        		//a++ + " " 
        	}
        	System.out.print("\n");
        }
	}

}
