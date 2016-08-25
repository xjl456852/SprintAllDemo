package com.lucky.test.spring;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.lucky.test.HelloWorldService;

public class BeanFactoryTest {
	@Test
	public void test1() {
		ClassPathResource res = new ClassPathResource("tinyioc.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		// 3.获取bean
		HelloWorldService helloWorldService = (HelloWorldService) factory
				.getBean("helloWorldService");
		helloWorldService.helloWorld();

	}

	@Test
	public void test2() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"tinyioc.xml");
		// 提前初始化的功能
		ctx.start();
		HelloWorldService helloWorldService = (HelloWorldService) ctx
				.getBean("helloWorldService");
		helloWorldService.helloWorld();
	}

	public void test3() {
		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext(
		// "tinyioc-postbeanprocessor.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"tinyioc-postbeanprocessor.xml");
		ctx.start();
		HelloWorldService helloWorldService = (HelloWorldService) ctx
				.getBean("helloWorldService");
		helloWorldService.helloWorld();
	}
}
