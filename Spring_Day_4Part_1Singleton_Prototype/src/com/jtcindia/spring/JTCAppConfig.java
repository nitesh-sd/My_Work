package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@Import({})
@ImportResource({""})
public class JTCAppConfig {
	@Bean
	@Scope("prototype")
	public Hello createHello(){
		System.out.println("CreateHello****");
		Hello hello = Hello.getHello();
		return hello;
	}
	@Bean
	@Scope("prototype")
	public Runtime createRT() {
		System.out.println("CreateRT****");
		Runtime rt = Runtime.getRuntime();
		return rt;		
	}
}

// Here both are Beans works like similar way