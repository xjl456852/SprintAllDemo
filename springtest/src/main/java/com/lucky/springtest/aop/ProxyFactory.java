package com.lucky.springtest.aop;

/**
 * @author yihua.huang@dianping.com
 */
public class ProxyFactory extends AdvisedSupport implements AopProxy {

	public Object getProxy() {
		return createAopProxy().getProxy();
	}

	protected final AopProxy createAopProxy() {
		return new Cglib2AopProxy(this);
	}
}
