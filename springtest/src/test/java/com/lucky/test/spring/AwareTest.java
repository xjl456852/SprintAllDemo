package com.lucky.test.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AwareTest {

	@Test
	public void test1() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("tinyioc.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
        System.out.println(hello.getHelloWord());
        System.out.println(hello.sayHello());
        
	}

}


