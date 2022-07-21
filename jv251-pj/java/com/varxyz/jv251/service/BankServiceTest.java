package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;
import com.varxyz.jv251.exception.CustomerNotFoundException;

public class BankServiceTest {

	public static void main(String[] args) {
		BankService service = BankService.getInstance();
		
		String name = "동탁";
		String ssn = "881122-1234567";
		String phone = "010-1234-1234";		
		String userId = "framework";
		String passwd = "1111";
		String accountNum = null;
//		1. 신규 고객 등록
		service.addCustomer(name, ssn, phone, userId, passwd);
		try {
			//2.Saving Account 생성
			service.addSavingsAccount(7000.0, 0.4, ssn);
		} catch (CustomerNotFoundException e) {			
			e.printStackTrace();
		}
		//3. 고객 등록 확인
		Customer customer = service.getCustomerBySsn(ssn);
		System.out.println(customer);
		
//		4. 고객 계좌 목록 확인
		
		List<Account> myList = service.getAccountBySsn(ssn);
		System.out.println(myList.size());
		for(Account account : myList) {
			System.out.println(account);
			accountNum = account.getAccountNum();
			System.out.println(accountNum);			
		}
		
		Account account = service.getAccountByAccountNum(accountNum);
		service.deposit(15000, account);		
		System.out.println(account);
		
	
	}

}
