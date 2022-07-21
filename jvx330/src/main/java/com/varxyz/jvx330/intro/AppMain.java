package com.varxyz.jvx330.intro;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		String config ="com/varxyz/jvx330/intro/beans.xml"; // 스프링 빈 위치
		GenericApplicationContext context = new GenericXmlApplicationContext(config); //스프링 컨테이너
		Hello hello = (Hello) context.getBean("helloBean");
		//or 
		// Hello hello = context.getBean("helloBean",Hello.class);
			
		//Hello hello = new HelloBeanKo();
		
		System.out.println(hello.sayHello("Spring"));
		context.close();
	}
}
