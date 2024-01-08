package com.jtcindia.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppConfig {
	@Bean("myhai")
	public Hai createHai1() {
		System.out.println("CreateHai_1 in JTCAppConfig");
		Hai hai = new Hai();
		return hai;
	}
	@Bean("myhai")
	public Hai createHai2() {
		System.out.println("CreateHai_2 in JTCAppConfig");
		Hai hai = new Hai();
		return hai;
	}
	
	
	
	@Bean("myhello")
	public Hello createHello(Hai hai) {
		System.out.println("CreateHello");
		Hello h = new Hello();
		h.setHai(hai);
		return h;
	}
}
