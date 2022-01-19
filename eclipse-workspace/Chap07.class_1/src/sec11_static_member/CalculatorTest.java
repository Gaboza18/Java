package sec11_static_member; // static 타입 변수

class Calculator {
	static double pi = 3.14159;

}

public class CalculatorTest {

	public static void main(String[] args) {

		// 반지름: 10.0 원의 면적 구하기, 둘레 구하기

		double area = 10.0 * 10.0 * Calculator.pi; // (반지름)^2 * pi = 넓이
		double perimeta = 2 * 10.0 * Calculator.pi; // 2*(반지름)* pi = 둘레

		System.out.println("반지름:10.0 의 원의 면적: " + area);
		System.out.println("반지름:10.0 의 원의 둘레: " + perimeta);
	}

}
