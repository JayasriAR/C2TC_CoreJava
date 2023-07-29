package com.cg.daythree.Encapsulation;

public class Encapsule {
private String name;
private int accno;
private int balance;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Your bank details [name=" + name + ", accno=" + accno + ", balance=" + balance + "]";
}


}
