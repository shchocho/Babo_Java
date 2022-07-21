package com.varxyz.jv300.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCExample5 {
	

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
			String sql = "DELETE FROM Customer WHERE name = ?";
			stmt = con.prepareStatement(sql); // 오픈2			
			stmt.setString(1, "유비");			
			stmt.executeUpdate(); 
		
			
			System.out.println("DELECT....");
			
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
