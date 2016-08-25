package com.lucky.test.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.junit.Assert;
import org.springframework.validation.Errors;

public abstract class AbstractCustomerValidatorRule implements
		CustomerValidatorRule {

	public abstract boolean support(Annotation annotation);

	public void valid(Annotation annotation, Object object, Field field,
			Error error) throws Exception {
		// TODO Auto-generated method stub

	}

	private void preHandle(Annotation annotation, Object target, Field field,
			Errors errors) {
	}

//	public abstract void validProperty(Annotation annotation, Object property,
//			PostHandler postHandler);
}
