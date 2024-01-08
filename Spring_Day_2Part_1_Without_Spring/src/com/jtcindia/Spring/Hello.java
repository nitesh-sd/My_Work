package com.jtcindia.Spring;

public class Hello {
	A aobj;
	B bobj;
	static {
		System.out.println("sb in Hello");
	}
	public Hello(B bobj) {
		super();
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
