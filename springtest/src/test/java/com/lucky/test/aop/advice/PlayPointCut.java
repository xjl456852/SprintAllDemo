package com.lucky.test.aop.advice;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

public class PlayPointCut implements Pointcut {

	public ClassFilter getClassFilter() {
		// TODO Auto-generated method stub
		return new PlayClassFilter();
	}

	public MethodMatcher getMethodMatcher() {
		// TODO Auto-generated method stub
		return new PlayMethodMatcher();
	}

}
