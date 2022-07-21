package com.varxyz.jv251.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv251.domain.Customer;

public class CustomerDao {	
	
	public CustomerDao() {
		
	}
	
	public List<Customer> findAllCustomers(){
		String sql = "SELECT * FROM Customer";
		List<Customer> customerList = new ArrayList<Customer>();
		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {				
				con = DateSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				rs= pstmt.executeQuery();
				while(rs.next()) {
					Customer c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));
					customerList.add(c);					
				}	
			}finally {
				DateSourceManager.close(rs,pstmt,con);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return customerList;
	}
	
	
	public Customer findCusotmerBySsn(String ssn){
		String sql = "SELECT * FROM Customer WHERE ssn = ?";
		Customer c= null;
		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DateSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs= pstmt.executeQuery();
				if(rs.next()) {
					c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));	
					c.setPasswd(rs.getString("passwd"));
				}	
			}finally {
				DateSourceManager.close(rs,pstmt,con);				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(name,ssn,phone,userId,passwd)"
				+ "VALUES(?,?,?,?,?)";
		try {			
			String name = customer.getName();
			String ssn = customer.getSsn();
			String phone = customer.getPhone();
			String userId = customer.getUserId();
			String password = customer.getPasswd();
			
			Connection con = DateSourceManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,name);
			pstmt.setString(2,ssn);
			pstmt.setString(3,phone);
			pstmt.setString(4,userId);
			pstmt.setString(5,password);
			
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			System.out.println("INSERTED------------");
			
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}				
	}


}
