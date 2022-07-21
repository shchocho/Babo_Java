package com.varxyz.jv251.domain;

import java.util.Date;

import com.varxyz.jv251.exception.InsufficientBalanceException;

public class SavingsAccount extends Account {

	private double interestRate;
	
	
	public SavingsAccount() {
		
	}	
	
	SavingsAccount(String accountNum, double amount){
		this(accountNum, amount, 1.03);
	}	
	
	SavingsAccount(String accountNum, double amount, double interesRate) {
		super(accountNum, amount);
		interestRate = interesRate;		
	}
	
	public void withdraw(double amount) {
		//기존 통장에는 출금에 대출과 다른 제약이 필요없다고 생각.
		
		if(balance - amount < 0) {
			throw new InsufficientBalanceException("잔고부족");
		}
		super.balance -= amount;
		System.out.println("출금이 완료 되었습니다.");
	}

	

	
	@Override
	public void deposite(double amount) {
		//하지만 savingsAccount에는 이율이 입금되었을때 적용된다고 가정하여
		//override를 통한 추가 메소드 내용을 작성.
		balance += amount ;	
		balance *= interestRate;
		System.out.println("입금이 완료 되었습니다. 입금금액은 이율"+ interestRate +"이 적용된" + balance + "입니다.");
	}

	@Override
	protected String getAccountNum(Account account) {		
		return account.accountNum;
	};

	@Override
	public void setCustomer(Customer customer2) {
		customer = customer2;
		
	}

	public double getInteresRate() {
		// TODO Auto-generated method stub
		return interestRate;
	}

	public void setInteresRate(double double1) {
		interestRate = double1;
		
	}

	public void setRegDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	public void setAccountType(char c) {
		super.setAccountType(c);
		accountType = c;		
	}
	
	
}
 