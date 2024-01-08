package com.jtcindia.spring;

public class Hai {
	A aobj;
	B bobj;
	static {
		System.out.println("sb in Hai");
	}
	public A getAobj() {
		return aobj;
	}
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	public B getBobj() {
		return bobj;
	}
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
	
	public void show() {
		System.out.println("Show in Hai");
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
//Here we are using setter and getter
