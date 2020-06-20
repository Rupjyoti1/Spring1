package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class REstFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		System.out.println("Inside REStFortuneService");
		return null;
	}

}
