package com.varxyz.jv251.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class ABCDao {
	
	public ABCDao() {
		try {
			Connection con = DateSourceManager.getConnection();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public void doSomething() {
		// 처리중...
		
		// 데이터 매니져 연결
	}

}
