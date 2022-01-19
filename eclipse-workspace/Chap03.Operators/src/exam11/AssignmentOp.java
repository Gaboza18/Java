package exam11;

public class AssignmentOp { // 대입연산자

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;

		number1 += 4; // number1 = number1+4
		number2 -= 4; // number2 = number2-4

		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);

		number1 *= 2; // number1 = number1*2 (초기값이 아닌 위에 +가 실행된 후에 * 진행)
		System.out.println("number1: " + number1);

		number2 /= 2; // number1 = number1/2 (초기값이 아닌 위에 -가 실행된 후에 / 진행)
		System.out.println("number1: " + number2);
	}

}