package com.jtcindia.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JTCAppConfig {
//	@Bean("myhai1")
//	public Hai createHai1() {
//		System.out.println("CreateHai_1 in JTCAppConfig");
//		Hai hai = new Hai();
//		return hai; //this will call the constructor
//	}
//	@Bean("myhai2")
//	public Hai createHai2() {
//		System.out.println("CreateHai_2 in JTCAppConfig");
//		Hai hai = new Hai();
//		return hai;
//	}
//	
	
	@Bean("myhello")
	public Hello createHello(Hai hai) { //1. Dependency  -> Hello dependency called as Hai
		//if this create method will called then container has to pass its parameter that is Hai hai
		//Inside the createHello how many beans are running, there is two beans one is Hello and another one is Hai hai 
		//Iwe pass Hai hai as a parameter
		System.out.println("CreateHello");
		Hello h = new Hello();
		h.setHai(hai);
		return h;
	}
}
