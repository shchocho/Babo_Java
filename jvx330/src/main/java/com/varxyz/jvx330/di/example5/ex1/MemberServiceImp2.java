package com.varxyz.jvx330.di.example5.ex1;

public class MemberServiceImp2 implements MemberService{
	
	public MemberServiceImp2() {
		System.out.println("빈 생성:" + this);
	}

	@Override
	public void addMember(String id, String passwd) {
		System.out.println("New member inserted : " + id + "/" + passwd);
	}
}
