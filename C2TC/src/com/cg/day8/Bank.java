package com.cg.day8;

public interface Bank {
static final int Minbal=5000;
static final int deposit_limit=25000;
void withdraw(int amt);
void deposit(int amt);
}
