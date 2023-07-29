package com.cg.daythree.Constructor;

public class Constructcall {
	//parameterized Constructor
	String name;
	Constructcall(String name){
		this.name = name;
		System.out.println("Welcome "+name+" Constructor is called once when object  is created");

	}
	Constructcall(){
		//default constructor
	System.out.println("Welcome --> deault constructor");
}
}