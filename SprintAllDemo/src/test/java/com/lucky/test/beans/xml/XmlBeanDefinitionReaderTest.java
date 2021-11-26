package com.lucky.test.beans.xml;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.lucky.springtest.beans.BeanDefinition;
import com.lucky.springtest.beans.io.ResourceLoader;
import com.lucky.springtest.beans.xml.XmlBeanDefinitionReader;

/**
 * @author yihua.huang@dianping.com
 */
public class XmlBeanDefinitionReaderTest {

	@Test
	public void test() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
		Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
		Assert.assertTrue(registry.size() > 0);
	}
}
