package com.jtcindia.Spring;

public class Hello {
	// Here we are creating SUper type dependencies.
	A aobj;
	CustomerDAO customerDAO;

	public A getAobj() {
		return aobj;
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void show() {
		System.out.println("Show in Hello");
		System.out.println(aobj);
		System.out.println(customerDAO);
	}

}
