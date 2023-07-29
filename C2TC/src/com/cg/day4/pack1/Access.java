package com.cg.day4.pack1;

public class Access {
int a=98;
private int b=45;
public int c=32;
protected int d=45;
public void pubmethod() {
	System.out.println("pubmethod of c "+c);
	System.out.println("pubmethod def var "+a);
	
}
private void privmethod() {
	System.out.println("Private method b "+b);
	System.out.println("privmethod def var "+a);
}
protected void procmethod() {
	System.out.println("Protect method d "+d);
	System.out.println("procmethod def var "+a);
}
}