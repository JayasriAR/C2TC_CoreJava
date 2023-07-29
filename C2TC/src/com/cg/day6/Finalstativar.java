package com.cg.day6;

public class Finalstativar {
	    final static String company = "TCS";
	    String name;
	    int rollno;
	public
	    static void main(String[] args)
	    {
	        Finalstativar ob = new Finalstativar();
	  
	        // If we create a database 
	        // then the company name should be constant
	        // It can’t be changed by programmer.
	      //  ob.company = "TATA"; cannot change
	  
	        ob.name = "Jayasri";
	        ob.rollno = 39;
	        System.out.println(ob.company);
	        System.out.println(ob.name);
	        System.out.println(ob.rollno);
	    }
	}
