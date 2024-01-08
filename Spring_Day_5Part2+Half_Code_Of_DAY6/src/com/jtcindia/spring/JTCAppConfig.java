package com.jtcindia.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppConfig {

	//private List<String> emails;
	@Bean("myemails")
	public List<String> getEmails(){
		System.out.println("getEmails in JTCAppConfig");
		
		List<String> ems = new ArrayList<>();
		ems.add("som@jtc");
		ems.add("vivel@jtc");
		ems.add("jtc@jtc");
		return ems;
	}
	
	//private Set<Integer> phones;
	@Bean("myphones")
	public List<Integer> getPhones(){
		System.out.println("getEmails in JTCAppConfig");
			List<Integer> phs = new ArrayList<>();
				phs.add(123000);
				phs.add(765439);
				phs.add(76542);
				phs.add(987654);
				phs.add(876549);
			return phs;
	}
	@Bean("myCust")
	public Customer createCustomer(List<String> myemails, List<Integer> myphones) {
		Customer cust = new Customer(101,"abc","abc@jtc",23456, myemails,myphones);
		return cust;
	}	
}
