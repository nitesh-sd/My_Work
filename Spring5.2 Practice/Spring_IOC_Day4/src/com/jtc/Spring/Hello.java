package com.jtc.Spring;

public class Hello {
	static Hello hello;
	static {
		System.out.println("Sb in Hello");
		hello = new Hello();
	}
	public Hello() {
		System.out.println("D.C in Hello");
	}
	
	public static Hello getHello() {
		return hello;
	}
	public void show() {
		System.out.println("show in Hello");
	}
	
	
	

}
