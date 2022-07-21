package banking;

public class InsufficientBalanceException extends RuntimeException {
	//이전 은행의 예로 내가 만약에 예외를 만나도 끝까지 실행을 시켜야지 이 구문이 만족
	// 왜냐하면 ex) ATM기에서 예외를 만났다고 아무동작도 안하면 그것대로 문제이므로
	// 예외는 처리하되 궂이 잡는 checkingException 대신 runtimeException을 선택
	
	InsufficientBalanceException(String message){
        super(message);
     }


}
