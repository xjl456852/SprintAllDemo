package com.lucky.test.spring;

import org.springframework.context.ApplicationEvent;

public class PropertyGettedEvent extends ApplicationEvent {

	public PropertyGettedEvent(Object source) {
		super(source);
	}

}
