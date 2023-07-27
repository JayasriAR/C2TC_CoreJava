package com.cg.daytwo.hierachical;

public class Daughter2 extends Father {
	void me() {
		System.out.println("Iam the younger!!");
	}

	public static void main(String[] args) {
		//calling dad method
		Daughter2 ob = new Daughter2();
		ob.dad();
		ob.me();
	}

}
