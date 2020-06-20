package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
	
		//read Spring Config Java file
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from Spring Container
		
	//	Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
		
		Coach theCoach=context.getBean("swimCoach",Coach.class);		
		
		//call a  method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
