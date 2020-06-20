package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		System.out.println("Inside HappyFortuneService");
		return "Today is Your Lucky Day";
	}

}
