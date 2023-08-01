package com.cg.day7.Overload;

public class ConstOverload {
	int a,b;
ConstOverload(){
	a=0;
	b=0;
}

ConstOverload(int a){
	this.a=a;
	this.b=a;
}

ConstOverload(int a,int b){
	this.a=a;
	this.b=b;
}

@Override
public String toString() {
	return "ConstOverload [a=" + a + ", b=" + b + "]";
}

}
