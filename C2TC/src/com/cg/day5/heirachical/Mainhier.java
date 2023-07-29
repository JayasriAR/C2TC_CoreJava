package com.cg.day5.heirachical;

public class Mainhier {
	public static void main(String[] args) {
		//calling dad method
		Daughter1 ob1 = new Daughter1();
		ob1.dad();
		ob1.sis();
		Daughter2 ob = new Daughter2();
		ob.dad();
		ob.me();
	}

}
