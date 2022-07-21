package com.varxyz.jv200.mod007;

public class Airplane implements Flyer, Vehicle {

	@Override
	public void fly() {
		System.out.println("비행기 : 날기 ");
		
	}

	@Override
	public void takeOff() {
		System.out.println("비행기 : 이륙 ");
		
	}

	@Override
	public void land() {
		System.out.println("비행기 : 착륙 ");
		
	}
	
}
