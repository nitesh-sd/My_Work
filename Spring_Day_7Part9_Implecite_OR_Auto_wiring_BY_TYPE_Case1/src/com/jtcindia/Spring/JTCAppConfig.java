package com.jtcindia.Spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JTCAppConfig {
//	@Bean("myhai")
//	public Hai createHai1() {
//		System.out.println("CreateHai_1 in JTCAppConfig");
//		Hai hai = new Hai();
//		return hai; 
//	}

	
	@Bean(name = "myhello" , autowire = Autowire.BY_TYPE)
	public Hello createHello() { //we are not providing any parameter here for implicit wiring , But previously we provide parameter for Explicit wiring 
		System.out.println("CreateHello");
		Hello h1 = new Hello();
		return h1;
	}
}
