package banking;

public class CheckingAccount extends Account{
	private static final double DEFAULT_OVER_DRAFT = 1000000;
	private double overdraftAmount;
	//은행에서 만들때 대출한도는 설정되서 나옴, 즉 변수를 여기서 선언하려고 합니다.
	
	public CheckingAccount(){
		
	}
	
	public CheckingAccount(String accountNum, double amount) {
		this(accountNum, amount, DEFAULT_OVER_DRAFT);
		// TODO Auto-generated constructor stub
	}	
	
	CheckingAccount (String accountNum, double balance, double defaultOverDraft) {
		super(accountNum, balance);
		this.overdraftAmount = defaultOverDraft;
	}

	public void withdraw(double amount) {
		if(balance < amount) {
			//만약에 출금하려는 양이 가지고 있는 돈보다 작은경우는 총 두가지로 설정
			
			if(balance +overdraftAmount >=  amount) {
				// 내 잔액과 대출한도를 더 한 것이 출금하려는 양보다 많다면
				// 출금이 가능
				overdraftAmount = overdraftAmount - amount;
				System.out.println("대출이 완료 되었습니다.");
				if(overdraftAmount <= 0 ) {
					//하지만 그것이 대출금은 모두 소진하면
					// 내가 가지고 있는 금액에서도 금액을 소진시켜야 함
					balance = balance + overdraftAmount;
					System.out.println("대출이 완료 되었습니다.");
				}
			}else {
				//위의 경우는 두 금액을 더 해도 만족하지 않았을 경우 
				// 예외처리를 발생
				throw new OverDraftException("대출한도초과") ;
			}
			
		}else {
			//내가 가진 잔금으로도 충분히 해결이 가능하다면 해당 구문 실행
			super.balance -= amount;
			System.out.println("출금이 완료 되었습니다.");
		}
	}
	

	public double getOverDraftAmount() {
		// TODO Auto-generated method stub
		return overdraftAmount;
	}

	public void setOverDraftAmount(double double1) {
		// TODO Auto-generated method stub
		overdraftAmount = double1;
	}

	
	

}
