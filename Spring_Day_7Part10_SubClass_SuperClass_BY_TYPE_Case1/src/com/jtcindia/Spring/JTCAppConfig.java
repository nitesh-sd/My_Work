package com.jtcindia.Spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppConfig {

	@Bean("bo")
	public B createB() {
		System.out.println("createB in JTCAppConfig");
		B b1 = new B();
		return b1;
		
	}
	
	@Bean("cdao")
	public CustomerDAO getCustDAO() {
		System.out.println("getCustDAO in JTCAppConfig");
		return new CustomerDAOImpl();
	}
	
	//If we are doing Explicit wiring then we need to pass the parameter here 
	/*
	 * public Hello createHello(B bo, CustomerDAO cdao) {
	 * 
	 * }
	 */
	@Bean(name = "myhello", autowire = Autowire.BY_TYPE)
	public Hello createHello() {
		System.out.println("createHello in JTCAppCongi");
		return new Hello();
		
	}
}
