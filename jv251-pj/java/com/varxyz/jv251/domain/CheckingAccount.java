package com.varxyz.jv251.domain;

import com.varxyz.jv251.exception.OverDraftException;

public class CheckingAccount extends Account{
	private static final double DEFAULT_OVER_DRAFT = 1000000;
	private double overdraftAmount;
	//은행에서 만들때 대출한도는 설정되서 나옴, 즉 변수를 여기서 선언하려고 합니다.
	
	public CheckingAccount(){
		
	}
	
	public CheckingAccount(String accountNum, double amount) {
		this(accountNum, amount, DEFAULT_OVER_DRAFT);
		// TODO Auto-generated constructor stub
	}	
	
	CheckingAccount (String accountNum, double balance, double defaultOverDraft) {
		super(accountNum, balance);
		this.overdraftAmount = defaultOverDraft;
	}

	public void withdraw(double amount) {
		if(balance < amount) {			
			double overdraftNeeded = amount - balance;
			if(overdraftAmount < overdraftNeeded) {
				throw new OverDraftException("에러: 대출한도초과", balance, overdraftNeeded) ;
			} else {
				balance = 0.0;
				overdraftAmount = overdraftAmount - overdraftNeeded;
				}
			}else {
				balance = balance - amount;
			}				
	}	
	
	public double getOverDraftAmount() {		
		return overdraftAmount;
	}
	
	public void setOverDraftAmount(double overdraftAmount) {		
		this.overdraftAmount = overdraftAmount;
	}	
	
	public void setAccountType(char c) {
		accountType = c;
		
	}
}
