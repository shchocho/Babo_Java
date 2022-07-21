package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.dao.AccountDao;
import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;

public class AccountService {
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void addAccount(Account account) {
		accountDao.addAccount(account);		
	}
	
	public List<Account> getAccountByCustomer(Customer customer) {
		return accountDao.getAccountByCustomer(customer);
	}
	
	public List<Account> getAccountsBySsn(String ssn){
		return accountDao.findAccountsBySsn(ssn);
	}
	
	public Account getAccountByAccountNum(String accountNum){
		return accountDao.findAccountBySsn(accountNum);
	}
	

	
	
	
	/*
	 * xxx-xx-xxxx 형식의 계좌번호 생성
	 * */
	public String generateAccountNum() {
		String accountNum = "";
		for(int i = 0; i < 3; i ++) {
			accountNum += ((int) Math.floor(Math.random() * 10)) + "";			
		}
		
		accountNum += "-";
		
		for(int j = 0; j < 3; j ++) {
			accountNum += ((int) Math.floor(Math.random() * 10)) + "";		
		}
		
		accountNum += "-";
		
		for(int t = 0; t < 4; t ++) {
			accountNum += ((int) Math.floor(Math.random() * 10)) + "";		
		}
		
		return accountNum;
	}

	
	
	
	

}
