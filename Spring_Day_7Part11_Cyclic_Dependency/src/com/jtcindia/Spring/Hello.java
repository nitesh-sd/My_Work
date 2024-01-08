package com.jtcindia.Spring;

public class Hello {
	// Here we are creating SUper type dependencies.
	A aobj;
	B bobj;

	public A getAobj() {
		return aobj;
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	
//	public Hello(A aobj, B bobj) {
//		super();
//		this.aobj = aobj;
//		this.bobj = bobj;
//	}
	

	public void show() {
		System.out.println("Show in Hello");
		System.out.println(aobj);
		System.out.println(bobj);
	}

	public B getBobj() {
		return bobj;
	}

	public void setBobj(B bobj) {
		this.bobj = bobj;
	}

}
