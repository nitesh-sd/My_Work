package com.jtcindia.Spring;

public class B {
	int b;
	String str;
	
	static {
		System.out.println("sb in B");
	}
	public B(int b, String str) {
		System.out.println("2 para constr in B");
		this.b = b;
		this.str = str;
	}
	@Override
	public String toString() {
		return "B [b=" + b + ", str=" + str + "]";
	}	
}
