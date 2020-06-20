package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		System.out.println("Inside Random Fortune Service");
		return null;
	}

}
