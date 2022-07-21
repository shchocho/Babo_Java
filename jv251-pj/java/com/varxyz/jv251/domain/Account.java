package com.varxyz.jv251.domain;

import java.sql.Timestamp;
import java.util.Date;

/*
 * @author 최수현
 * 선생님 비둘기가 어떻게 우시는지 아십니까..
 * 바로 ... 구구...
 * 구구!!
 * */

public abstract class Account {
	
	protected long aid;
	protected String accountNum;	
	protected double balance;
	protected Customer customer;
	protected Date regDate;
	protected char accountType;	
	
	Account(){
		
	}
	
	Account(String accountNum, double balance){
		this.accountNum = accountNum;
		this.balance = balance;
	}
	

	
	public void deposite(double amount) {	
		balance += amount ;			
		System.out.println("입금이 완료 되었습니다"+  balance + "입니다.");
	}


	protected String getAccountNum(Account account) {		
		return account.accountNum;
	};

	public void setCustomer(Customer customer2) {
		customer = customer2;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;		
	}
	
	public void setBalance(double balance) {
		this.balance = balance;		
	}	

	public String getAccountNum() {
		return accountNum;
	}


	public Double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public String getCustomerId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return customer;
	}
	public void setAid(long string) {
		this.aid = string;
	}
	public void setRegDate(Date date) {
		regDate = (Timestamp) date;		
	};
	
	public void setAccountType(char c) {
		this.accountType = c;
	}
	
	public char getAccountType() {
		return accountType;
	}
	
	@Override
	public String toString() {
		return accountNum + "," + balance + "," + customer;	
	}
	
	

}
