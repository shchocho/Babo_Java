package com.varxyz.jv251.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.CheckingAccount;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;

public class AccountDao {
	
	public AccountDao() {
		
	}
	
//	public List<Account> findAllAccount(){
//		String sql = "SELECT * FROM Account";
//		List<Account> accountList = new ArrayList<Account>();
//		
//		try {
//			Connection con = null;
//			PreparedStatement pstmt = null;
//			ResultSet rs = null;
//			try {
//				con = DateSourceManager.getConnection();
//				pstmt = con.prepareStatement(sql);
//				rs= pstmt.executeQuery();
//				while(rs.next()) {
//					
//					CheckingAccount a = new CheckingAccount();				
//					a.setAccountNum(rs.getString("accountNum"));
//					a.setBalance(rs.getDouble("balance"));	
//					a.setCustomerId(rs.getLong("customerId"));			
//					accountList.add(a);					
//				}	
//			}finally {
//				DateSourceManager.close(rs,pstmt,con);		
//				
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return accountList;
//	}
	
	public Account findAccountBySsn(String accountNum){		
		Account account = null;
		String sql = "SELECT a.aid, a.accountNum, a.balance, a.interesRATE, a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate"
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE a.accountNum = ?";
		
		try {			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				con = DateSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, accountNum);
				rs= pstmt.executeQuery();				
				
				while(rs.next()) {
					if(rs.getString("accountType").charAt(0) == 'S') {
						account = new SavingsAccount();
						((SavingsAccount)account).setInteresRate(
								rs.getDouble("overdraft"));						
					}else {
						account = new CheckingAccount();
						((CheckingAccount)account).setOverDraftAmount(
								rs.getDouble("overdraft"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setCustomer(new Customer(rs.getString("name"),
							rs.getString("ssn"),
							rs.getString("phone")));
					account.setRegDate(rs.getTimestamp("regDate"));
					account.setAccountType(rs.getString("accountType").charAt(0));
					
							
				}
			}finally {				
				DateSourceManager.close(rs,pstmt,con);
			}
			System.out.println("FIND ACOUNT... \n");
				
		}
		catch(SQLException e){			
			e.printStackTrace();
		}
		return account;	
	}
	
	
	
	
	
	
	
	
	
	public List<Account> findAccountsBySsn(String ssn){		
		String sql = "SELECT a.aid, a.accountNum, a.balance, a.interesRATE, a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate"
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = ?";
		List<Account> list = new ArrayList<Account>();
		try {			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				con = DateSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs= pstmt.executeQuery();				
				Account account = null;
				while(rs.next()) {
					if(rs.getString("accountType").charAt(0) == 'S') {
						account = new SavingsAccount();
						((SavingsAccount)account).setInteresRate(
								rs.getDouble("overdraft"));						
					}else {
						account = new CheckingAccount();
						((CheckingAccount)account).setOverDraftAmount(
								rs.getDouble("overdraft"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setCustomer(new Customer(rs.getString("name"),
							rs.getString("ssn"),
							rs.getString("phone")));
					account.setRegDate(rs.getTimestamp("regDate"));
					list.add(account);
					
				}
			}finally {
				DateSourceManager.close(rs,pstmt,con);
			}
			System.out.println("NEW ACCOUNT INSERTED... \n");
				
		}
		catch(SQLException e){			
			e.printStackTrace();
		}				
		return list;
		
	}
	

	// 모범답안 죽어도 인정안함 무조건 혼자 만들꺼임	
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account(accountNum, balance, interesRATE,overdraft,accountType,customerId) "
				+ "VALUES (?, ?, ?, ?, ?,?)";
		try {			
			Connection con = null;
			PreparedStatement pstmt = null;
			
			try {
				con = DateSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);				
				pstmt.setString(1, account.getAccountNum());
				pstmt.setDouble(2, account.getBalance());
				if(account instanceof SavingsAccount) {
					SavingsAccount sa = (SavingsAccount)account;
					pstmt.setDouble(3, sa.getInteresRate());
					pstmt.setDouble(4, 0.0);
					pstmt.setString(5, String.valueOf('S'));
				}else {
					CheckingAccount ca = (CheckingAccount) account;
					pstmt.setDouble(3, 0.0);
					pstmt.setDouble(4,ca.getOverDraftAmount());
					pstmt.setString(5, String.valueOf('C'));
				}
				pstmt.setLong(6, account.getCustomer().getCid());
				pstmt.executeUpdate();			
			}finally {
				DateSourceManager.close(pstmt,con);		
			}
			System.out.println("NEW ACCOUNT INSERTED... \n");
				
		}
		catch(SQLException e){
			e.printStackTrace();
		}				
	}
	

	public List<Account> getAccountByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customer.getAccountList();
	}
	

}
