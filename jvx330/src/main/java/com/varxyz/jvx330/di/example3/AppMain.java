package com.varxyz.jvx330.di.example3;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class AppMain {

	public static void main(String[] args) {
		//String config = "com/varxyz/jvx330/di/example3/beans.xml";		
		//GenericApplicationContext context = new GenericXmlApplicationContext(config);
		
		
		//자바 클래스 내에서 config 설정을 만들시에는 이렇게 annotation을 쓰기 떄문에 new 타입도 변경하셈
		
		GenericApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MemberService memberService= context.getBean("memberService",MemberService.class);
		
		memberService.getAllMembers().forEach(member -> System.out.println(member));
		
//		List<Member> list  = memberService.getAllMembers();
//		for(Member member : list) {
//			System.out.println(member);
//		} 위에꺼 풀어쓰면 이렇게 댐 약간 js 에로우 펑션 느낌이라고 기억 하셈
		
		System.out.println(memberService.getAllMembers());
		context.close();
		

	}

}
