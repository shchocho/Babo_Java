package com.varxyz.jv300.jdbc002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCExample4 {
	

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		//jdbc db 위치를 통상 url이라고 함
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		
		
		
		//DriverManager - > CheckedExcption ㅇㅋ?
		try {
			Class.forName(driver);  
			System.out.println("LOADED DRIVER --->" + driver);
			
			con = DriverManager.getConnection(url, id, passwd);		 // 오픈1	
			System.out.println("CONNECTED TO --->" + url);
			
			//sql을 전달하려고 연결한거임 -> 어떻게 전달함? -> 문자열로 전달함
			String sql = "INSERT INTO Account(accountNum, balance, interesRATE, accountType, customerId) "
					+ "VALUES (?,?,?,?,?)";
			stmt = con.prepareStatement(sql); // 오픈2
			stmt.setString(1, "554-749-7784");
			stmt.setString(2, "785540.0");
			stmt.setString(3, "0.8");
			stmt.setString(4, "S");
			stmt.setString(5, "1002");
			stmt.executeUpdate(); //오픈 3
		
		
			
			System.out.println("INSERTED....");
			
//			rs.close();			
//			stmt.close();			
//			con.close();	
						
		} catch (Exception e) {		
			
			
			e.printStackTrace();
		}  finally {				
			try {
			
				stmt.close();
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}					
		}		
	}
}
