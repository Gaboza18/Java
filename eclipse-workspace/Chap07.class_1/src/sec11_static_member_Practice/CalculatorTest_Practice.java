package sec11_static_member_Practice;

class Calculator {
	static double pi = 3.14159; // 고정된 값 바꾸거나 바뀌지 않는다
}

public class CalculatorTest_Practice {

	public static void main(String[] args) {

		double area = 10.0 * 10.0 * Calculator.pi;
		double perimeta = 2 * 10.0 * Calculator.pi;

		System.out.println("면적: " + area);
		System.out.println("둘레: " + perimeta);

	}

}
