package com.varxyz.jvx330.di.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 여기에 있는 클래스는 설정관련 클래스라고 언지해줌
public class AppConfig {
	@Bean
	public MemberService memberService() {
		return new MemberService(memberDao());
	}
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
}
