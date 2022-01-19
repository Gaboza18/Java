package sec02_exception_syntax;

public class ExceptionHandling {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int) (Math.random() * 10); // 0<Math.random<10.xxxxx
				System.out.println(result);
			} catch (ArithmeticException e) { // 랜덤숫자가 0이 나오면 문구 출력후 다음숫자 생성
				System.out.println("0으로 나눌수 없습니다.");
			}

		}
	}
}
