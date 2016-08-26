package com.lucky.test.aop.notice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 切面，通知的类
 */
public class AdviceTest {

	public void adviceTest() {
		System.out.println("我是aop，我进去了");
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"test-aop.xml");
		ctx.start();
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		helloWorld.sayHello();
	}
}
