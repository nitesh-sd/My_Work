package com.jtcindia.Spring;

public class B{
	A a;
	
	public B() {
		System.out.println("D.C in B");
	}
	
	public B(A a) {
		this.a = a;
	}
	
	
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B sub Type ***** ";
	}
	
	

}
