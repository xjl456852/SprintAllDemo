package com.lucky.test;

import java.io.File;
import java.net.URL;

public class RootPathTest {

	public static void main(String[] args) throws Exception {
		
		System.out.println("-----------获取类加载的根路径------------------------");
		System.out.println(RootPathTest.class.getResource("").getPath());
		
		System.out.println("--------------获取当前类的所在工程路径; 如果不加“/”  获取当前类的加载目录---------------------");

		System.out.println(RootPathTest.class.getResource("/").getPath());

		System.out.println("------------获取项目路径 -----------------------");
		File directory = new File("");// 参数为空
		String courseFile = directory.getCanonicalPath();
		System.out.println(courseFile);
		System.out.println("-----------------------------------");
		URL xmlpath = RootPathTest.class.getClassLoader().getResource("");  
		System.out.println(xmlpath);
		
		System.out.println("-----------------------------------");
		URL xmlpath2 = RootPathTest.class.getClassLoader().getResource("tinyioc.xml");  
		System.out.println(xmlpath2);
		
		System.out.println("-------------获取当前工程路径 ----------------------");
		System.out.println(System.getProperty("user.dir"));  
		System.out.println("-----------------------------------");

        System.out.println(System.getProperty("java.class.path"));  


	}

}
