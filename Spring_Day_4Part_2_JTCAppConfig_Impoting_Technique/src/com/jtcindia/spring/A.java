package com.jtcindia.spring;

public class A {
	int a;
	String msg;
	static {
		System.out.println("sb in A");
	}
	// we have discussed that we can initialize these two variable in two ways
	// one is with constructor
	// another is with setter method.
	A() {
		System.out.print("Default constr in A");
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "A [a=" + a + ", msg=" + msg + "]";
	}
}
