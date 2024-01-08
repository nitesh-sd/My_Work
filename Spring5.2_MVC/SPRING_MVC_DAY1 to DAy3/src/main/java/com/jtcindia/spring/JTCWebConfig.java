package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({"com.jtcindia.spring"})
public class JTCWebConfig {
	
	public JTCWebConfig() {
		System.out.println("D.C in JTCWebConfig()");
	}	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("VIewResolver in JTCWebConfig ");
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/");
	viewResolver.setSuffix(".jsp");//--> suffix and prifix work like this  /show.jsp
	return viewResolver;
	}
}
