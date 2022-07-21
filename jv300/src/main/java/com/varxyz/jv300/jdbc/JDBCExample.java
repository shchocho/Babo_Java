package com.varxyz.jv300.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		//jdbc db 위치를 통상 url이라고 함
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		
		//DriverManager - > CheckedExcption ㅇㅋ?
		try {
			Class.forName(driver);  
			System.out.println("LOADED DRIVER --->" + driver);
			
			con = DriverManager.getConnection(url, id, passwd);		 // 오픈1	
			System.out.println("CONNECTED TO --->" + url);
			
			//sql을 전달하려고 연결한거임 -> 어떻게 전달함? -> 문자열로 전달함
			String sql = "SELECT * FROM Customer";
			stmt = con.createStatement(); // 오픈2
			rs = stmt.executeQuery(sql); //오픈 3
			while(rs.next()) {
				long cid = rs.getLong("cid");
				String customerId = rs.getString("customerId");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				
				System.out.println(cid);
				System.out.println(customerId);
				System.out.println(name);
				System.out.println(phone);
				System.out.println("------------------------------");					
			}
			
//			rs.close();			
//			stmt.close();			
//			con.close();	
						
		} catch (Exception e) {					
			e.printStackTrace();
		}  finally {				
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}					
		}		
	}
}
