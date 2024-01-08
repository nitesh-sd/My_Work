package com.jtcindia.Spring;

public class A {
	B b;
	
	public A() {
		System.out.println("D.C in A");
	}
	
	public A(B b) {
		this.b = b;
	}	

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A Super Type *****";
	}

}

