package com.jtc.Spring;

public class Lab1A {
	public static void main(String[] args) {
		A ao = new A();
		ao.setA(199);
		ao.setStr("Hello A");
		System.out.println(ao);
		
		System.out.println("**********");
		B bo = new B(888,"Hello in B");
		System.out.println(bo);
		
		System.out.println("***********");
		Hello h1 = new Hello(bo);
		h1.setAobj(ao);
		h1.show();
		
	}

}
