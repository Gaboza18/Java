package sec11_static_member_Practice;

class Calculator {
	static double pi = 3.14159; // ������ �� �ٲٰų� �ٲ��� �ʴ´�
}

public class CalculatorTest_Practice {

	public static void main(String[] args) {

		double area = 10.0 * 10.0 * Calculator.pi;
		double perimeta = 2 * 10.0 * Calculator.pi;

		System.out.println("����: " + area);
		System.out.println("�ѷ�: " + perimeta);

	}

}
