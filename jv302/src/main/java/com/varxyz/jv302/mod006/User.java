package com.varxyz.jv302.mod006;

public class User {
	private String userId;
	private String passwd;
	private String userName;
	private String ssn;
	private String email;
	private String addr;
	
	public User() {
		
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", passwd=" + passwd + ", userName=" + userName + ", ssn=" + ssn + ", email="
				+ email + ", addr=" + addr + "]";
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	

}