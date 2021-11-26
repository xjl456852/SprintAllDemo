package com.lucky.test.aop.advice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayTest {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext(
				"tinyioctest.xml");
		Play play = (Play) bf.getBean("playService");
		play.playService("pingpong");
	}
}
