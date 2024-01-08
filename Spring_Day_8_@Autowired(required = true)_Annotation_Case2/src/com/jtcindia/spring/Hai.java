package com.jtcindia.spring;

public class Hai {
	String msg;
	public void setMsg(String msg) {
		System.out.println("Setter in Hai");
		this.msg = msg;
	}
	public String toString() {
		return "Hai Msg *****";
	}

}
//Dependency of Hai is msg
