package test001;

public class CheckingAccount extends Account {
	private double rate = 1.01;
	
	public CheckingAccount(int balance , String accountNum) {
		this.balance = balance;
		this.accountNum = accountNum;	
	} 

	@Override
	public void deposit( int money ) {
		this.balance += money;
		System.out.println("입금 금액은" + money + " 이고, 현재 금액은" + balance + "입니다");
	}

	@Override
	public void widthDraw(int money) {		
		this.balance -= money;
		if(this.balance < 0 ) {
			System.out.println("금액이 한도 밖입니다");
			this.balance += money;
		 }else {
			 System.out.println("출금 금액은" + money + " 이고, 현재 금액은" + balance + "입니다");
		 }
	}
	
	public void rateOn() {
		this.balance *= rate;
		System.out.println("이율이 계산되었습니다 현재 금액은" + balance + "입니다.");
	}

}
