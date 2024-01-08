package com.jtc.Spring;

public class Hello {
	A aobj;
	B bobj;
	
	static {
		System.out.println("Sb in Hello");
	}
	public Hello(B bobj) {
		this.bobj = bobj;
	}
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	void show() {
		System.out.println("Show in Hello");
		System.out.println(aobj);
		System.out.println(bobj);
	}
	
	
	

}
