package com.cg.daytwo.basics;

public class Contibreakclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
	    while (i < 20) {
	    	//print only odd numbers ---> skip if even numbers 
	    	i++;
	        if (i%2==0)
	            continue; //skip current iteration
	        //terminate the loop when i==19 break
	        else if(i==19)
	        	break; //terminate current iteration
	        else
	            System.out.println(i);;
	    }

	}

}
