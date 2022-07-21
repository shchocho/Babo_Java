package com.varxyz.jv200.mod007;

public class Book {
	
	private int serial;
	
	public Book(int serial){
		this.serial = serial;
		System.out.println("생성하신 책 고유번호는" + this.serial + "입니다");
	}
	
	public int getSerial(){
		return this.serial;		
	}
	

}
