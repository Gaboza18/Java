package sec02_exception_syntax;

public class NoException { // 랜덤숫자 10개를 생성하여 100으로 나눈다.( 0이 나온경우)

	public static void main(String[] args) {

		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			result = number / (int) (Math.random() * 10); // 0<Math.random<10.xxxxx
			System.out.println(result); // 0이 나오면 멈춤
		}
	}

}
