package banking;



import java.util.*;


public class Customer {
	
//	List<Account> accountList = new ArrayList<Account>();
	
//	protected AccountServiceList accountList = new AccountServiceList();	
	// 아님
	private long cid;	
	private String name;
	private String ssn;
	private String phone;
	private String customerId;
	private String passwd;
	private List<Account> accountList;
	

	public Customer(){

	}
	
	public Customer(String name, String ssn, String phone) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
		
	}


	public Customer(int i) {
		this.cid = i;
	}
	public String getSsn() {
		// TODO Auto-generated method stub
		return ssn;
	}
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getCustomerId() {
		return customerId;
	}
	public String getPasswd() {
		return passwd;
	}
	public long getCid() {
		return cid;
	}	
	
	public void setCid(long cid) {
		this.cid = cid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
		
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
		
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;		
	}
	
	@Override
	public String toString() {
		return cid + " , " + name + " , " + ssn + " , " + phone + " , " + customerId + " , " + passwd + " , " + accountList;
	}
	
	
	

}
