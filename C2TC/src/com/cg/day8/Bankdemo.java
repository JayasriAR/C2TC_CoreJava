package com.cg.day8;

public class Bankdemo extends Person implements Bank{
 int balance=100000;
	
 
	public void withdraw(int amt) {
		if(balance>=amt-Minbal) {
			balance=balance-amt;
			System.out.println("Your Balance after withdrawal is "+balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}

	@Override
	public void deposit(int amt) {
		if(deposit_limit>=amt) {
			balance=balance+amt;
			System.out.println("Your Balance after deposit is "+balance);
		}
		else {
			System.out.println("Deposit limit exceeded");
		}
		
	}

}
