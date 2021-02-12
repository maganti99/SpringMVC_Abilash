package com.nagesh.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//Class which replaces Web.xml
public class SpringCalcInit1 implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
             System.out.println("Hello Maganti!! I am from StartUP");
             
             //Using XML config file
             //XmlWebApplicationContext appContext = new XmlWebApplicationContext();
             //appContext.setConfigLocation("/WEB-INF/nag-serv-servlet.xml");    
             //appContext.setConfigLocation("classpath:nag-serv-servlet.xml");
             
             AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
             webAppContext.register(SpringCalcConfig.class);
             
             //Create Dispatcher Servlet             
             DispatcherServlet disServ = new DispatcherServlet(webAppContext);
             
             //register
             ServletRegistration.Dynamic myCustomeDispServl = servletContext.addServlet("myDispServlet", disServ);
             
             myCustomeDispServl.setLoadOnStartup(1);
             myCustomeDispServl.addMapping("/nag/*");
             
             
	}

}
