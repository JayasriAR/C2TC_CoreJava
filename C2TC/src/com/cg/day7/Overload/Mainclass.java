package com.cg.day7.Overload;

public class Mainclass {

	public static void main(String[] args) {
		//method overloading
		   Overloadclass ob = new Overloadclass();
	       ob.display();
	       ob.display("John");
	       ob.display("John", "Tina");

	   //constructor overloading
	       ConstOverload c=new ConstOverload();
	       System.out.println(c);
	       c=new ConstOverload(20);
	       System.out.println(c);
	       c=new ConstOverload(30, 40);
	       System.out.println(c);
	       
	}

}
