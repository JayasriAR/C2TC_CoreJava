package com.cg.day7.Override;

public class MainOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RBI obj;
     SBI o1;
     ICICI o2;
     //parent object
     obj=new RBI();
     obj.Interest();
     //sbi child obj
     o1=new  SBI();
     o1.Interest();
     
     //icici child obj
     o2=new ICICI();
     o2.Interest();
     
     //upcasting Using parent obj andd accessing the child method 
     obj=new SBI();
     obj.Interest();
     
     obj=new ICICI();
     obj.Interest();
     
     System.out.println("_________Covariant override_______________");
 	Color c =new Color();
	c.getcolor();
	c=new Red();
	c.getcolor();
	
	}

}
