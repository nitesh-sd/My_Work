package com.jtcindi.spring;

public class Hello {
	static Hello hello;
	static{
		hello = new Hello();
	}
	private Hello() {
		
	}
	public static Hello getHello() {
		return hello;
		
	}
	public void show() {
		System.out.println("Show in Hello");
	}

}
