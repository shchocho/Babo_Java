package com.varxyz.jv300.banking;

import java.util.List;

import banking.Account;
import banking.AccountDao;
import banking.CheckingAccount;
import banking.Customer;
import banking.CustomerDao;

public class CustomerDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao = new CustomerDao();	
		
		Customer cs = new Customer();
		dao.addCustomer(cs);		
		
		cs.setCid(1055);
		cs.setCustomerId("qerw");
		cs.setName("마초");
		cs.setPasswd("4156");
		cs.setPhone("010-4484-7745");
		cs.setSsn("980406-1693011");
		
		List<Customer> customerList = dao.findAllCustomers();		
		for(Customer customer : customerList) {
			System.out.println(customer.toString());
		}	
	
		
//		List<Account> accountList = dao2.findAllAccount();
//		for(Account account : accountList) {
//			System.out.println(account.toString());
//		}
		
		

	}

}
