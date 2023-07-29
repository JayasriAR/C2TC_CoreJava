package com.cg.day6;

public class Staticclas {
	static String clgname="IFET";
static class nested{
	public static void Change(String name) {
		clgname=name;
	}
}
	static {
		System.out.println("Static block is executed First");
	}

	public static void main(String[] args) {
		//static method don't need objects
		//static variable -->the variable belongs to the class itself rather than to
		//any specific instance of the class
		System.out.println("Your Instituition Name "+clgname);
		//accessing a static class -->static method
		Staticclas.nested ob=new Staticclas.nested();
		ob.Change("IIT");
		System.out.println("Your New Instituition Name "+clgname);
	}

}
