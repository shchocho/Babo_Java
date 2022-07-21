package com.varxyz.jv200.mod007;

/*
 * -- abstract 메소드의 집합, 상수(public 상태에서의)는 가능
 * -- instance 생성 불가
 * -- 다중 상속을 지원한다
 * @author choi
 * */

public interface Flyer {
	public void fly(); //인터페이스 안에서는 abstract, public 이 기본 탑제(디폴트 값이여서)여서 생략이 가능;
	public void takeOff();
	public void land();	
}
