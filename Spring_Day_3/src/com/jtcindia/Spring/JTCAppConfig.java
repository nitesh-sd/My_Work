package com.jtcindia.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JTCAppConfig {
	

	@Bean("Hello")	
	@Scope("singleton")
	@Lazy(true)
	public Hello getHello(){
		System.out.println("GetHello");
		return new Hello();
		
	}
	@Bean("Hai")
	@Scope("prototype")
	@Lazy(false)
	public Hai getHai() {
		System.out.println("GetHai");
		return new Hai();
	}
}
