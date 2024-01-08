package com.jtcindia.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JTCWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses() method in JTCWebAppInitializer");
		//we can have different configuration files
		//Class cls[] = {JTCWebConfig.class};
		return new Class[] {JTCWebConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses() method in JTCWebAppInitializer");
		return new Class[] {JTCWebConfig.class};
		
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings() method in JTCWebAppInitializer");

		// TODO Auto-generated method stub
		return new String[] {"*.jtc"};
	}
	
} 


