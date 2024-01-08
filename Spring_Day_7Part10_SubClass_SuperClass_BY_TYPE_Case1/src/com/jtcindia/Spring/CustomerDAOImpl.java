package com.jtcindia.Spring;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void addCustomer() {
		System.out.println("addCustomer in Customer");
	
	}
	@Override
	public String toString() {
		return "CustomerDAOImpl []********";
	}
}
