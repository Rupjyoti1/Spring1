package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicaitonContext.xml");
		
		Coach  theCoach=context.getBean("tennisCoach",Coach.class);
		Coach  theAlphaCoach=context.getBean("tennisCoach",Coach.class);
		
		boolean result=(theCoach==theAlphaCoach);
		System.out.println("Pointing to the Same Loaction "+result);
		System.out.println(theCoach);
		System.out.println(theAlphaCoach);

		context.close();
	}

}
