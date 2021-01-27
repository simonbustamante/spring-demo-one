package com.bustamante.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		// retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
	
		
		System.out.println(theCoach.getDailyFortune());
		
		
		context.close();
	}

}
