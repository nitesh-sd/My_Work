package com.jtc.Spring;

public class A {
//	int a;
//	String str;
//	static {
//		System.out.println("SB in A class");
//	}
//	public A( int a, String str) {
//	this.a = a;	
//	this.str = str;
//	}	
//	
//	@Override
//	public String toString() {
//		return "A [a=" + a + ", str=" + str + "]";
//	}
	
	int a;
	String str;
	static {
		System.out.println("SB in A");
		
	}
	A(){
		System.out.println("Default constr in A");
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", str=" + str + "]";
	}
		

}
