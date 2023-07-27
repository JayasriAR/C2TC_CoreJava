package com.cg.dayone;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c;
		c=a+++b;  //executed as a++ + b;value of a changes
		System.out.println("a++ + b= "+c);
		System.out.println("value of a after change "+a);
		int d = 5; //binary value of 5  
		//binary not ~5-->-5-1 = -6
		System.out.println(~d);
		// a --> 8421 --- 01011    b--> 16 8421--- 10100
		//a|b ---- > 11111 --> 31 any one condition true all are true
		System.out.println ( a|b );  
		//a^b ----> xor operator (both value are same then 0; 1 1 --> 0)
    	System.out.println ( a^b );
		

	}

}
