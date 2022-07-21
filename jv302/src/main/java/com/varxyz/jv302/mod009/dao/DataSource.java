package com.varxyz.jv302.mod009.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSource {
	private String jdbcDriver;
	private String jdbcUrl;
	private String jdbcUserName;
	private String jdbcPasswd;
	
	public DataSource(String jdbcDriver, String jdbcUrl,String jdbcUserName,String jdbcPasswd) {
		super();
		this.jdbcDriver = jdbcDriver;
		this.jdbcUrl = jdbcUrl;
		this.jdbcUserName = jdbcUserName;
		this.jdbcPasswd = jdbcPasswd;
		
		try {
			Class.forName(jdbcDriver);
		} catch (ClassNotFoundException e) {			
			throw new  RuntimeException("JDBCDriverNotAvailableException");
		}
		
	}
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPasswd);
			
		} catch (SQLException e) {			
			throw new RuntimeException("ConnectionNotAvailableException");
		}
	}
	
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs != null && !rs.isClosed()) {
			rs.close();
		}
		if(pstmt != null && !pstmt.isClosed()) {
			pstmt.close();
		}
		if(con != null && !con.isClosed()) {
			con.close();
		}
	}
	
	public void close( PreparedStatement pstmt, Connection con) throws SQLException {
		
		if(pstmt != null && !pstmt.isClosed()) {
			pstmt.close();
		}
		if(con != null && !con.isClosed()) {
			con.close();
		}
	}
	
	public void close( Connection con) throws SQLException {		
		if(con != null && !con.isClosed()) {
			con.close();
		}
	}
	
}
