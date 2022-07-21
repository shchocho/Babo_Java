package com.varxyz.jv300.banking;

import java.util.Date;

import banking.Account;
import banking.AccountDao;
import banking.Customer;
import banking.SavingsAccount;

public class AccountDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDao dao = new AccountDao();
		
		SavingsAccount a = new SavingsAccount();
		a.setAccountNum("111-222-3333");
		a.setBalance(45000.0);
		a.setCustomer(new Customer(1003));
		a.setInteresRate(0.04);
		a.setRegDate(new Date());
		a.setAccountType('S');
		dao.addAccount(a);
		
		
		
		for(Account account : dao.findAccountsBySsn("991122-1234567")) {
			System.out.println(account.getCustomer());
		}
		
		
		

	}

}
