package com.varxyz.jv302.mod009.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.varxyz.jv302.mod009.domain.User;
import com.varxyz.jv302.mod009.service.NamingService;


public class UserDao {
	
	NamingService namingService = NamingService.getInstance();
	DataSource da = (DataSource)namingService.getAttribute("dataSource");
	
	
	public void addUser(User user) {

		System.out.println("INSERTED------------");
		String sql = "INSERT INTO SingedUser(userId,passwd,userName,ssn,email,addr)"
				+ "VALUES(?,?,?,?,?,?)";
		try {
			
			Connection con = null;
			PreparedStatement pstmt = null;
			System.out.println(user.getUserId());
			
			try {
				
				con = da.getConnection();			
				pstmt = con.prepareStatement(sql);
				
				String userId = user.getUserId();
				String passwd = user.getPasswd();
				String userName = user.getUserName();
				String ssn = user.getSsn();
				String email = user.getEmail();
				String addr = user.getAddr();
				System.out.println(user.getUserId());			
				
				pstmt.setString(1,userId);
				pstmt.setString(2,passwd);
				pstmt.setString(3,userName);
				pstmt.setString(4,ssn);
				pstmt.setString(5,email);
				pstmt.setString(6,addr);
				
				pstmt.executeUpdate();						
				
			}
			
			finally{
				da.close(pstmt,con);
			}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("INSERTED------------");
					
	}


	
	
	
	public List<User> findAllUser() {
		System.out.println("INSERTED------------");
		String sql = "SELECT * FROM SingedUser";
		List<User> customerList = new ArrayList<User>();
		try {			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			
			try {
				con = da.getConnection();
				pstmt = con.prepareStatement(sql);
				rs= pstmt.executeQuery();
				
				while(rs.next()) {
					User u = new User();
					u.setUserId(rs.getString("userId"));
					u.setPasswd(rs.getString("passwd"));
					u.setUserName(rs.getString("userName"));
					u.setSsn(rs.getString("ssn"));
					u.setEmail(rs.getString("email"));
					u.setAddr(rs.getString("addr"));
					customerList.add(u);					
				}	
				
				pstmt.executeUpdate();						
				
			}
			
			finally{
				da.close(rs,pstmt,con);
			}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return customerList;
	}

	
	public User findUserByUserId(String userId) {
		
		String sql = "SELECT * FROM SingedUser WHERE userId = ?";
		User user = null;
		try {		
			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;			
			
			try {
				con = da.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				rs= pstmt.executeQuery();	
				
				if(rs.next()) {
					user = new User();
					user.setUserId(rs.getString("userId"));
					user.setPasswd(rs.getString("passwd"));
					user.setUserName(rs.getString("userName"));
					user.setSsn(rs.getString("ssn"));
					user.setEmail(rs.getString("email"));
					user.setAddr(rs.getString("addr"));
				}					
				
			}
			
			finally{
				da.close(rs,pstmt,con);
			}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
		return user;
	}





	public void editUser(User user) {
		
		System.out.println("UPDATE------------");
		String sql = "UPDATE SingedUser SET passwd = ?,userName = ?,ssn = ?,"
				+ "email = ?,addr = ? WHERE userId = ?";
		try {
			
			Connection con = null;
			PreparedStatement pstmt = null;
			System.out.println(user.getUserId());
			
			try {
				
				con = da.getConnection();			
				pstmt = con.prepareStatement(sql);
				
				String userId = user.getUserId();
				String passwd = user.getPasswd();
				String userName = user.getUserName();
				String ssn = user.getSsn();
				String email = user.getEmail();
				String addr = user.getAddr();
				System.out.println(user.getUserId());			
				
				pstmt.setString(1,passwd);
				pstmt.setString(2,userName);
				pstmt.setString(3,ssn);
				pstmt.setString(4,email);
				pstmt.setString(5,addr);
				pstmt.setString(6,userId);
				
				pstmt.executeUpdate();						
				
			}
			
			finally{
				da.close(pstmt,con);
			}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("UPDATE------------");
		
		
	}


}
