package com.nagesh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringCalcInit2 extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?> configClasses[] = {SpringCalcConfig.class};
		return configClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String urls[] = {"/nag/*"};
		return urls;
	}

}
