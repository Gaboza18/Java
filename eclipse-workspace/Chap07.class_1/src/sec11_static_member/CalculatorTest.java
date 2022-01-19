package sec11_static_member; // static Ÿ�� ����

class Calculator {
	static double pi = 3.14159;

}

public class CalculatorTest {

	public static void main(String[] args) {

		// ������: 10.0 ���� ���� ���ϱ�, �ѷ� ���ϱ�

		double area = 10.0 * 10.0 * Calculator.pi; // (������)^2 * pi = ����
		double perimeta = 2 * 10.0 * Calculator.pi; // 2*(������)* pi = �ѷ�

		System.out.println("������:10.0 �� ���� ����: " + area);
		System.out.println("������:10.0 �� ���� �ѷ�: " + perimeta);
	}

}
