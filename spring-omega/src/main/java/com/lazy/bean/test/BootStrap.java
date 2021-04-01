package com.lazy.bean.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BootStrap {
	public static void main(String[] args) {
		String resourcePath = "classpath*:beanFactoryTest.xml";

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(resourcePath);
		System.out.println(context.hashCode());
		MyTestBean bean = context.getBean(MyTestBean.class);
		System.out.println(bean.getTestStr());
	}
}
