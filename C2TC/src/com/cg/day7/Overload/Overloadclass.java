package com.cg.day7.Overload;

public class Overloadclass {
//method overloading -->same method different parameter
	void display() {
		System.out.println("HI!  Displaying default print ");
	}
	void display(String name) {
		System.out.println("HI! "+name+" Welcome");
	}
	void display(String name,String name2) {
		System.out.println("HI! "+name+" "+name2+"  Welcome you both ");
	}
	
}

