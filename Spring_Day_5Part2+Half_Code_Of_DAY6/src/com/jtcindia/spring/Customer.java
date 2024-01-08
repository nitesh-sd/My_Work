package com.jtcindia.spring;

import java.util.List;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private long phone;
	
	private List<String> emails;
	private List<Integer> phones;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("Default cons in Customer");
	}
	
	public Customer(int cid, String cname, String email, long phone, List<String> emails, List<Integer> phones) {
		System.out.println("para constr in Customer");
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.emails = emails;
		this.phones = phones;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}
	
	
	
	
	
	
	
	
}
