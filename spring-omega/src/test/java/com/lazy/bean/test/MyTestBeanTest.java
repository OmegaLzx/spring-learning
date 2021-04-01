package com.lazy.bean.test;

import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyTestBeanTest {
	@Test
	public void name() {
		String resourcePath = "/Users/omega/workspace/spring-framework/spring-omega/src/main/resources/beanFactoryTest.xml";
		resourcePath = resourcePath.replace("/", "//");
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(resourcePath);

		MyTestBean bean = context.getBean(MyTestBean.class);
		System.out.println(bean.getTestStr());
	}
}