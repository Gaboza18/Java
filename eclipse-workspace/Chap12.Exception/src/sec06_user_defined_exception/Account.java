package sec06_user_defined_exception;

/*
 * 은행 계좌정보 저장 클래스 
 */

public class Account {
	private long balance; // 현재 계좌에 들어있는 잔액

	public Account() {
	}

	public long getBalance() { // 현재 잔액을 알려주는 메소드
		return balance;
	}

	public void deposit(int money) { // 계좌에 입금하는 메소드
		balance += money;
	}

	// 계좌에서 출금하는 메소드, withdraw()를 호출하는 프로그램에서 반드시 예외처리를 해주어야함(잔액<출금금액)
	public void withdraw(int money) throws BalanceException {
		if (balance < money) { // 잔액이 부족할 경우 예외를 발생 시킨다
			throw new BalanceException("잔액부족: -"+ (money - balance) + "원");
		}
		balance -= money; // 잔액이 부족하지 않으면 계좌에서 금액을 차감
	}
}
