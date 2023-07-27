package com.cg.daytwo.hierachical;

public class Daughter1 extends Father{
	void me() {
		System.out.println("Iam the Elder!!");
	}

	public static void main(String[] args) {
		//calling dad method
		Daughter1 ob1 = new Daughter1();
		ob1.dad();
		ob1.me();

	}

}
