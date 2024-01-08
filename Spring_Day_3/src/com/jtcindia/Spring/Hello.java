package com.jtcindia.Spring;

public class Hello {
	static {
		System.out.println("sb in Hello");
	}
	Hello(){
		System.out.println("D.c in Hello");
	}
	public void showHello() {
		System.out.println("ShowHello *****");
	}
}
