package com.lucky.test.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class PlayAdvice implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("my before advice");
		
	}

}
