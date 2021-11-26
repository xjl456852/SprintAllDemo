package com.lucky.test.aop.advice;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodCounter implements Serializable {

	private HashMap<String, Integer> map = new HashMap<String, Integer>();

	private int allCount;

	protected void count(Method m) {

	}

	protected void count(String methodName) {
		Integer i = map.get(methodName);
		i = (i != null) ? new Integer(i.intValue() + 1) : new Integer(i);
		map.put(methodName, i);
		++allCount;
	}

	public int getCalls(String methodName) {
		Integer i = map.get(methodName);
		return (i != null) ? i.intValue() : 0;
	}
}

class CountingBeforeAdvice extends MethodCounter implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		count(method);

	}

}
