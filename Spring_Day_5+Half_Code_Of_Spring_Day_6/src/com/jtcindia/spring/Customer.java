package com.jtcindia.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private long phone;
	private List<String> emails;
	private Set<Integer> phones;
	private Map<String, Integer> refs;
	private Properties props;
	private Address address;
	private List<Account> accounts;
	
	public Customer() {
		System.out.println("D.C in Customer");
	}
	//Not create a constructor with simple type parameters
	
	public Customer(int cid, String cname, String email, long phone) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
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

	public Set<Integer> getPhones() {
		return phones;
	}

	public void setPhones(Set<Integer> phones) {
		this.phones = phones;
	}

	public Map<String, Integer> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Integer> refs) {
		this.refs = refs;
	}



	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}
}
