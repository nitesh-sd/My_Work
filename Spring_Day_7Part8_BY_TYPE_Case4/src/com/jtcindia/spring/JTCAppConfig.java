package com.jtcindia.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JTCAppConfig {
	//private Address address;
	
	@Bean("myadd1")
	public Address getAdd2() {
		Address add = new Address();
		System.out.println("getAdd2 in JTCAppConfig");
		add.setStreet("Sec-95");
		add.setCity("North Delhi");
		add.setState("New Delhi");
		return add;
	}
	
	@Bean("mycust")
	public Customer createCustomer(List<String> myemails, Set<Integer> myphones, Map<String,Integer> myrefs, Properties myprops, Address myadd, List<Account> myacc) {
		System.out.println("CreateCustomer in JTCAppConfig");
		Customer cust = new Customer(101,"som","som@jtc",19832);
		cust.setEmails(myemails);
		cust.setPhones(myphones);
		cust.setRefs(myrefs);
		cust.setProps(myprops);
		cust.setAddress(myadd);
		cust.setAccounts(myacc);
		
		return cust;
	}	
}


//Here it is compairing the object as BY_TYPE