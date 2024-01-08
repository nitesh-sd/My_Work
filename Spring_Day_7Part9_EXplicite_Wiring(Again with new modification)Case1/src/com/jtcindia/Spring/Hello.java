package com.jtcindia.Spring;

public class Hello {
	Hai hai;
	public Hello() {
		System.out.println("D.C in Hello");
	}
	
	public void show() {
		System.out.println("Show in Hello");
	}
	public Hai getHai() {
		return hai;
	}
	public void setHai(Hai hai) {
		this.hai = hai;
	}
}
