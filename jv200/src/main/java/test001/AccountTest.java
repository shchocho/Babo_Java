package test001;

public class AccountTest {

	public static void main(String[] args) {
		CheckingAccount a = new CheckingAccount(1000, "112345");
		
		a.deposit(2000);
		
		a.widthDraw(500);
		
		a.rateOn();

	}

}
