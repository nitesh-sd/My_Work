package com.jtcindia.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab8 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppConfig.class);
		System.out.println("Container is ready*********");
		Customer cust = (Customer) ctx.getBean("mycust");
		System.out.println(cust);
		// call Getter Method with cust...
		System.out.println(cust.getEmail());
		System.out.println(cust.getEmails());
		System.out.println(cust.getPhones());
		for (Account acc : cust.getAccounts()) {
			System.out.println(acc);
		}
		List ls = new ArrayList();
		System.out.println(ls);
	}
}
