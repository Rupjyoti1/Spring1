package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class TennisCoach implements Coach {
     
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	
	//define the  default constructor
	
	public TennisCoach() {
		System.out.println("Inside TennisCoach Defualt Constructor");
	}
	
	//define init method
	@PostConstruct
	public void doMyInitMethod() {
		System.out.println("Inside doMyInitMethod ");
	}
	
	@PreDestroy
	public void doMyDestoryMethod() {
		System.out.println("Inside doMyDestoryMethod ");
	}
	
	//define a setter method
   /*@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Inside setFortuneService method");
		fortuneService=theFortuneService;
	}*/
	
	//using any  method
	
	/*@Autowired
	public void doCrazzyStuff(FortuneService theFortuneService) {
		System.out.println("Inside doCrazzyStuff method");
		fortuneService=theFortuneService;
	}*/
	
	
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkOut() {
	System.out.println("Inside TennisCoach Class");
		return "Practice your Backhand Volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
