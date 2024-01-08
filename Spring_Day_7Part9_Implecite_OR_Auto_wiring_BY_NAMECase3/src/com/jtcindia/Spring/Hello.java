package com.jtcindia.Spring;

public class Hello {
	Hai hai;
	public Hello() {
		System.out.println("D.C in Hello");
	}
	
	public void show() {
		System.out.println("Show in Hello");
		System.out.println(hai);
	}
	public Hai getHai() {
		return hai;
	}
	public void setHai(Hai hai) {
		System.out.println("SetHai inside Hello****");
		this.hai = hai;
	}
}
//Here the dependency of hello is hai
//here we define one default constructor one method and one getter and setter.