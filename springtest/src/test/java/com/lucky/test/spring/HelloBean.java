package com.lucky.test.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloBean implements ApplicationContextAware {
	public ApplicationContext context;
	private String helloWord = "Hello!World!";

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context = applicationContext;
	}

	public void setHelloWord(String helloWord) {
		this.helloWord = helloWord;
	}

	public String getHelloWord() {
		context.publishEvent(new PropertyGettedEvent("[" + helloWord
				+ "] is getted"));
		return helloWord;
	}

	public String sayHello() {
		context.publishEvent(new PropertyGettedEvent("[" + helloWord
				+ "] is getted"));
		return helloWord;
	}
}
