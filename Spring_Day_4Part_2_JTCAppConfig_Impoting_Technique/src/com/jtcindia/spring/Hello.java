package com.jtcindia.spring;

public class Hello {
	A aobj;
	B bobj;
	static {
		System.out.println("sb in Hello");
	}
	
	public Hello() {
		System.out.println("Default constr in Hello");
	}
	Hello(A obj, B bobj){
		System.out.println("2 para constr in Hello");
		this.aobj = aobj;
		this.bobj = bobj;
	}
	
	void show() {
		System.out.println("Show in Hello");
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
//We have written parameterize constructor 
/*Let say we have a requirement 
 * we have written different DAO*/