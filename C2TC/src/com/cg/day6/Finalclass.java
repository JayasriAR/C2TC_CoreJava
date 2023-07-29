package com.cg.day6;

public final class Finalclass {
    final int x = 20;
    final public void method1() {
    	System.out.println("Final method");
    }
// CANNOT OVERRIDE or INHERIT FINAL METHOD1 
//public class child extends Finalclass{
//	public void method1()
//	{
//		System.out.println("cannot override");
//	}
//}
	public static void main(String[] args) {
		// final--> non-changeable (impossible to inherit or override)
		Finalclass f=new Finalclass();
		//f.x=29;  cannot changed the value of final variable
		System.out.println(f.x);

	}

}
