package com.bustamante.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the string configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call method fortune
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the application context
		
		context.close();

	}

}
