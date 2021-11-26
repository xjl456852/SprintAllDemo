package com.lucky.test.aop.advice;

import org.springframework.aop.ClassFilter;

public class PlayClassFilter implements ClassFilter {

	public boolean matches(Class<?> clazz) {
		if (clazz.getSimpleName().equalsIgnoreCase("play")) {
			return true;
		}
		return false;
	}

}
