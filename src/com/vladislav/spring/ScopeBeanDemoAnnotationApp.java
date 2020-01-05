package com.vladislav.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeBeanDemoAnnotationApp {
	
	public static void main(String[] args) { 
	// read spring config file
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	// get the bean from spring container
	Coach theCoach1 = context.getBean("tennisCoach", Coach.class);
	Coach theCoach2 = context.getBean("tennisCoach", Coach.class);
	
	boolean result = (theCoach1==theCoach2);
	System.out.println("Pointing to the same object " + result);

	}
}
