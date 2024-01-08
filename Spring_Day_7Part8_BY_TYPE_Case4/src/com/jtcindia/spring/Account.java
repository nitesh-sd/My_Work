package com.jtcindia.spring;

public class Account {
	private int accno;
	private String atype;
	private double bal;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Account(int accno, String atype, double bal) {
		super();
		this.accno = accno;
		this.atype = atype;
		this.bal = bal;
	}


	@Override
	public String toString() {
		return "Account [accno=" + accno + ", atype=" + atype + ", bal=" + bal + "]";
	}
	
	
	

}
