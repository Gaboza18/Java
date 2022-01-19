package exam02;

public class NestedWhileExample { // while 문을 이용한 구구단 작성

	public static void main(String[] args) {
		int number1 = 2; // 구구단의 '단'수를 선언

		while (number1 <= 9) { // 각 단에서 1~9까지 곱하여 계산결과 출력
			int number2 = 1;

			while (number2 <= 9) {
				System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
				number2++;
			}
			System.out.println("");
			number1++;
		}

	}

}
