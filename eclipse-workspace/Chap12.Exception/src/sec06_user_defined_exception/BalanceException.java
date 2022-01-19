package sec06_user_defined_exception;

/*
 * 계좌처리 실행 시, 잔액이 부족한 경우 발생하는 예외 정의 
 */

public class BalanceException extends Exception {
	public BalanceException() { // 기본 생성자
	}

	/*
	 * 입력 매개변수: message: 예외 발생시, 출력되는 메시지 지정
	 */

	public BalanceException(String message) {
		super(message);
	}

}
