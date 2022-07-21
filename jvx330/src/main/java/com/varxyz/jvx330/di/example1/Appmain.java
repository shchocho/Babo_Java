package com.varxyz.jvx330.di.example1;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class Appmain {

	public static void main(String[] args) {
		String config ="com/varxyz/jvx330/di/example1/beans.xml"; // 스프링 빈 위치
		GenericApplicationContext context = new GenericXmlApplicationContext(config); //스프링 컨테이너
		
		Foo foo = context.getBean("foo",Foo.class);
		System.out.println(foo);
		
		Foo foo2 = context.getBean("foo2",Foo.class);
		System.out.println(foo2);		
		

//		Bar bar = new Bar();
//		Foo foo = new Foo();
//		foo.setBar(bar);
		
		context.close();

	}

}
