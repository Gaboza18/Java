package sec06_user_defined_exception;

public class AccountTest {

	public static void main(String[] args) {

		Account MyAccount = new Account(); // 계좌생성

		MyAccount.deposit(10000); // 예금입금
		System.out.println("현재잔액: " + MyAccount.getBalance() + "원");

		try {
			MyAccount.withdraw(8000); // 예금출금
			System.out.println("출금 후 현재잔액: " + MyAccount.getBalance() + "원");
		} catch (BalanceException e) {
			System.out.println(e.getMessage()); // 예외처리 메세지 출력
			e.printStackTrace();
		}
	}

}