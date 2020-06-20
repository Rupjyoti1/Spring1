package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
		//read Spring Config file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicaitonContext.xml");
		//get the bean from Spring Container
		
	//	Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class);		
		
		//call a  method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
