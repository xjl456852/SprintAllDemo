package com.lucky.test.retry;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;

public class BeanPropertyDescriptorTest {

	public static void main(String[] args) throws Exception {
		Test test = new Test();
		Field file = test.getClass().getDeclaredField("name");
		PropertyDescriptor bean = new PropertyDescriptor(file.getName(),
				Test.class);
		bean.getWriteMethod().invoke(test, "ddd");
		System.out.println(test.getName());

	}

}

class Test {
	private String name;
	private String pwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}