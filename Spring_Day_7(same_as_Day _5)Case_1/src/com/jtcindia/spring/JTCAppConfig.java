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
	
	@Bean("myemails")
	public List<String> getEmails(){
		System.out.println("getEmails in JTCAppConfig");
		//private List<String> emails;
		List<String> ems = new ArrayList<>();
		ems.add("som@jtc");
		ems.add("vivel@jtc");
		ems.add("jtc@jtc");
		return ems;
	}
	
	//private Set<Integer> phones;
	@Bean("myphones")
	public Set<Integer> getPhones(){
		System.out.println("getEmails in JTCAppConfig");
			Set<Integer> phs = new TreeSet<>();
				phs.add(123000);
				phs.add(765439);
				phs.add(76542);
				phs.add(987654);
				phs.add(876549);
			return phs;
	}
	
	//private Map<String, Integer> refs;
	@Bean("myrefs")
	public Map<String, Integer> getRefs(){
		Map<String, Integer> refs = new TreeMap<>();
		refs.put("A", 1223);
		refs.put("A", 3245);
		refs.put("C", 94383);
		refs.put("D", 33211);
		refs.put("E", 48478);
		return refs;
		
	}
	
	//private Properties myprops;
	@Bean("myprops")
	@Primary
	public Properties getProps() {
		System.out.println("getProps in JTCAppConfig ******");
		Properties props = new Properties();
		props.put("F", 55555);
		props.put("G", 32555);
		props.put("H", 955583);
		props.put("I", 3351);
		props.put("J", 48558);
		return props;
		
	}
	
	//private Address address;
	@Bean("myadd")
	public Address getAdd() {
		Address add = new Address();
		System.out.println("getAddress in JTCAppConfig");
		add.setStreet("Sec-2");
		add.setCity("Noida");
		add.setState("U.P");
		return add;
	}
		
	
	//private List<Account> accounts;
	@Bean("myacc")
	public List<Account> getAccounts(){
		System.out.println("getAccount in List<Account>");
		List<Account> myacc = new ArrayList();
		myacc.add(new Account(101,"SA",34567));
		myacc.add(new Account(102,"DA",76457));
		myacc.add(new Account(103,"CA",65438));
		myacc.add(new Account(104,"SA",34676));
		return myacc;
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
	
	

