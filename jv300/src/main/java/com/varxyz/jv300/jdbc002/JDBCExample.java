package com.varxyz.jv300.jdbc002;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

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
			String sql = "SELECT * FROM Account";
			stmt = con.createStatement(); // 오픈2
			rs = stmt.executeQuery(sql); //오픈 3
			while(rs.next()) {
				long aid = rs.getLong("aid");
				String accountNum = rs.getString("accountNum");
				double balance = rs.getDouble("balance");
				double intrersRATE = rs.getDouble("interesRATE");
				double overdraft = rs.getDouble("overdraft");
				
				String accountType = rs.getString("accountType");
				long customerId = rs.getLong("customerId");
				Timestamp regDate = rs.getTimestamp("regDate");
				
				System.out.println(aid);
				System.out.println(accountNum);
				System.out.println(balance);
				System.out.println(intrersRATE);
				System.out.println(overdraft);
				System.out.println(accountType);
				System.out.println(customerId);
				System.out.println(regDate);
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
