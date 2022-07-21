package com.varxyz.jvx330.di.example6;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MenuAutowireTest {

	public static void main(String[] args) {
		String config = "com/varxyz/jvx330/di/example6/beans.xml";		
		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		
		MenuItemController controller = context.getBean("menuItemController",MenuItemController.class);
		controller.procssRequestAdd(new MenuItem("꼬꼬면",2000));
		controller.procssRequestAdd(new MenuItem("스낵면",1500));
		controller.procssRequestAdd(new MenuItem("아이스아메리카노",1500));
		
		
		System.out.println(controller.procssRequestFindAll());		
		System.out.println(controller.procssRequestFindItem("꼬꼬면"));		
		System.out.println(controller.procssRequestFindItem("아이스아메리카노"));
		
		
		context.close();

	}

}
