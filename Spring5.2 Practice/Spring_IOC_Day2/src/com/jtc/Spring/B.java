package com.jtc.Spring;

public class B {
//	int b;
//	String str2;
//	static {
//		System.out.println("SB in B class");
//	}	
//
//	public void setB(int b, String str2) {
//		this.b = b;
//		this.str2 = str2;
//	}
//
//	
//	public void setStr2(String str2) {
//		this.str2 = str2;
//	}
//
//
//	@Override
//	public String toString() {
//		return "B [b=" + b + ", str2=" + str2 + "]";
//	}
	
	int b;
	String str2;
	static {
		System.out.println("SB in B class");
	}	

	public B(int b, String str) {
		System.out.println("2 para constr in B");
		this.b = b;
		this.str2 = str;
	}
	@Override
	public String toString() {
		return "B [b=" + b + ", str2=" + str2 + "]";
	}
	
	
	
	
}
