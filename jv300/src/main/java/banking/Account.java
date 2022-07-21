package banking;


import java.util.Date;

/*
 * @author 최수현
 * 선생님 비둘기가 어떻게 우시는지 아십니까..
 * 바로 ... 구구...
 * 구구!!
 * */

public abstract class Account {
	protected long aid;
	protected String accountNum; // 계좌번호
	protected double balance; // 계좌 잔액
	protected Customer customer;
	protected Date regDate;
	protected char accountType;

	public Account() {

	}

	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public void deposite(double amount) { // 예금 메소드
		this.balance += amount; // 현재 잔액에 해당 값 만큼 추가2
	}

	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public Date setRegDate(Date regDate) {
		return this.regDate = regDate;
	}

	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}
}
