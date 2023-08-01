package com.cg.day8.String;

public class Stringclass {

	public static void main(String[] args) {
		// String directly assigned
		String greeting = " Hello world! ";
		System.out.println(greeting);
		System.out.println(greeting.length());
        System.out.println(greeting.trim());
        System.out.println(greeting.length());
		
		//array --> string
		char[] strArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(strArray);
		System.out.println(helloString);
 
		String s1=new String();
		String s2=new String();
		s1="Hello";
		s2="H1";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String a1="Hello";
		String a2="Hello";
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}

}
