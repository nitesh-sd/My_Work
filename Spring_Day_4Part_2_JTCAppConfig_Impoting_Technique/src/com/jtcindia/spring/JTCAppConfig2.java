package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppConfig2 {
	
	@Bean("myHello")
	public Hello createHello(A ao, B bo) {
		Hello h1 = new Hello(ao,bo);
		return h1;
	} 
}
