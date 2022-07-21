package com.varxyz.jv251.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class ConnectionManager { // 현재는 드라이버 주소가 모른다고 가정
	private static final String JDBC_URL = null; // 드라이버 주소;
	private static final String JDBC_USER = null; // 유저;
	private static final String JDBC_PASSWD = null; //드라이버 비밀번호;
	private static ConnectionManager connectionManager = new ConnectionManager();
		
	private ConnectionManager() {
		
	}
	
	
	public static ConnectionManager getLibary() {
		return connectionManager;
	}

	
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWD);
	}
	
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	} 
	
	public static void close( PreparedStatement pstmt, Connection con) throws SQLException {
		if(pstmt != null) {
			pstmt.close();
		}	
		if(con != null) {
			con.close();
		}
	} 

}
