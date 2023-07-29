package com.cg.day4.pack1;

public class Accessoutofclass {
public static void main(String[] args) { 
Access a =new Access();
a.pubmethod();
//a.privmethod(); private method cannot be accessed outside the class
a.procmethod();
}
}
