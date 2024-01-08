package com.jtcindia.Spring;

public class Lab1A_Setting_the_value {
	public static void main(String[] args) {
		System.out.println("Main in Lab1A");
		//Without Spring
		//create and initialize of object.
		A ao = new A();
		System.out.println(ao);
		ao.setA(199);
		ao.setMsg("Hello A");
		System.out.println(ao);
		
		System.out.println("*****************");
		B bo = new B(888,"Hello in B");
		System.out.println(bo);
		
		System.out.println("*****************");
		Hello h1 = new Hello(bo);
		h1.setAobj(ao);
		h1.show();
	}
}
