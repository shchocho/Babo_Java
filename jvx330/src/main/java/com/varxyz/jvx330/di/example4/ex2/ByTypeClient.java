package com.varxyz.jvx330.di.example4.ex2;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class ByTypeClient {
	// ByType 이면 명확한 타입을 째라 같은 타입이 두개 이상 있으면 다매다매 다요
	// 근데 Type 을 사람들이 많이 씀 이유가 뭐냐면 자바가 원하는 폴리모피즘 잘해줌 궂이 dns,jms 라고 안하고 그냥 namingService 라고 하나만 해줌
	// 근데 Name은 직접 해줘야함
	private NamingService service;
	
	public NamingService getNamingService() {
		return service;
	}
	
	public void setnamingService(NamingService service) {
		this.service = service;
	}
	
	public void service(String name) {
		Object o = service.lookup(name);
		System.out.println(o);
	}
	
	
	public static void main(String[] args) {
		String config = "com/varxyz/jvx330/di/example4/ex2/beans.xml";		
		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		
		ByTypeClient client = context.getBean("byTypeClient", ByTypeClient.class);
		client.service("myQueue");
		context.close();
	}
}
