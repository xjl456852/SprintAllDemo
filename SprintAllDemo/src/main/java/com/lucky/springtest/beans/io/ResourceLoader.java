package com.lucky.springtest.beans.io;

import java.net.URL;

/**
 * @author yihua.huang@dianping.com
 */
public class ResourceLoader {

	public Resource getResource(String location) {
		URL resource = this.getClass().getClassLoader().getResource(location);
		return new UrlResource(resource);
	}

	public static void main(String[] args) {
		//加载的是classpath下面的类路径
		System.out.println(ResourceLoader.class.getResource("").getPath());
		System.out.println(ResourceLoader.class.getResource("/").getPath());

//		System.out.println(ResourceLoader.class.);
	}
}
