package com.lucky.test.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodMatcher;

public class PlayMethodMatcher implements MethodMatcher {
	public boolean isRuntime() {
		return true;
	}

	public boolean matches(Method method, Class c) {
		if (c.getSimpleName().equals("Play")
				&& method.getName().contains("Service"))
			return true;
		return false;
	}

	public boolean matches(Method method, Class c, Object[] args) {
		if (c.getSimpleName().equals("Play")
				&& method.getName().contains("Service"))
			return true;
		return false;
	}
}