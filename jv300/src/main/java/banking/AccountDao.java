package banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_ID = "jv250";
	private static final String JDBC_PASSWORD = "jv250";
	
	public AccountDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOAD DRIVER -----------> " + JDBC_DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
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
//				con = DriverManager.getConnection(JDBC_URL, JDBC_ID, JDBC_PASSWORD);
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
//				rs.close();
//				pstmt.close();
//				con.close();
//				
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return accountList;
//	}
	
	public List<Account> findAccountsBySsn(String ssn){
		String sql = "SELECT a.aid, a.accountNum, a.balance, a.interesRATE, a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate"
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = ?";
		List<Account> list = new ArrayList<Account>();
		try {			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_ID, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
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
				pstmt.close();
				con.close();
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
				+ "VALUES (?,?,?,?,?,?)";
		try {			
			Connection con = null;
			PreparedStatement pstmt = null;
			
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_ID, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,  account.getAccountNum());
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
				pstmt.close();
				con.close();
			}
			System.out.println("NEW ACCOUNT INSERTED... \n");
				
		}
		catch(SQLException e){
			e.printStackTrace();
		}				
	}

}
