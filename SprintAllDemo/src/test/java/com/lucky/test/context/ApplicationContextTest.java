package com.lucky.test.context;

import org.junit.Test;

import com.lucky.springtest.context.ApplicationContext;
import com.lucky.springtest.context.ClassPathXmlApplicationContext;
import com.lucky.test.HelloWorldService;

/**
 * @author yihua.huang@dianping.com
 */
public class ApplicationContextTest {

    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
        
    }

    @Test
    public void testPostBeanProcessor() throws Exception {
    	//在初始化的时候会对bean进行beanpostprocess处理操作,每一个bean都会执行这些前后处理的方法操作
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc-postbeanprocessor.xml");
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("tinyioc-postbeanprocessor.xml");
        
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
        helloWorldService.helloWorld();
        HelloWorldService helloWorldService2=  (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService2.helloWorld();
    }
}
