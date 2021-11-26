package com.lucky.test.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class PropertyGettedListener implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.getSource().toString());
	}

}
