package com.lucky.test.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/*
 * 自定义注解处理接口
 */
public interface CustomerValidatorRule {

	public boolean support(Annotation annotation);

	public void valid(Annotation annotation, Object object, Field field,
			Error error) throws Exception;

}
