package com.lucky.test;

import com.lucky.springtest.beans.BeanPostProcessor;

/**
 * @author yihua.huang@dianping.com
 */
public class BeanInitializeLogger implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
		System.out.println("Initialize bean " + beanName + " start!");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
		System.out.println("Initialize bean " + beanName + " end!");
		return bean;
	}
}
