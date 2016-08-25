package com.lucky.springtest.context;

import java.util.List;

import com.lucky.springtest.beans.BeanPostProcessor;
import com.lucky.springtest.beans.factory.AbstractBeanFactory;

/**
 * @author yihua.huang@dianping.com
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
	protected AbstractBeanFactory beanFactory;

	public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	public void refresh() throws Exception {
		// 从配置文件加载bean
		loadBeanDefinitions(beanFactory);
		// 看看配置文件中是否有aop的相关的信息
		registerBeanPostProcessors(beanFactory);
		onRefresh();
	}

	protected abstract void loadBeanDefinitions(AbstractBeanFactory beanFactory)
			throws Exception;

	protected void registerBeanPostProcessors(AbstractBeanFactory beanFactory)
			throws Exception {
		// 看看BeanFactory中是否有拦截器的配置信息
		List beanPostProcessors = beanFactory
				.getBeansForType(BeanPostProcessor.class);
		for (Object beanPostProcessor : beanPostProcessors) {
			beanFactory
					.addBeanPostProcessor((BeanPostProcessor) beanPostProcessor);
		}
	}

	protected void onRefresh() throws Exception {
		beanFactory.preInstantiateSingletons();
	}

	public Object getBean(String name) throws Exception {
		return beanFactory.getBean(name);
	}
}
