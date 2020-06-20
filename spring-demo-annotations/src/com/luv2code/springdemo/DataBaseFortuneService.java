package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		System.out.println("Inside DataBaseFortuneService");
		return null;
	}

}
