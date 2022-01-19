package sec03_overriding; // �������̵� ���� �޼ҵ� �̸�, �Ű�����, ����Ÿ�� ����

class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator ��ü�� areaCircle() ����");
		return 3.14159 * r * r;
	}
}

class Computer extends Calculator {
	double areaCircle(double r) { // ����������: areaCircle() , double r, return Math.PI * r * r; ����
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}

public class ComputerExample {

	public static void main(String[] args) {

		int r = 10; // ������

		Calculator cal = new Calculator();
		System.out.println(cal.areaCircle(r)); // ���� Ŭ���� Calculator() �޼ҵ�
		System.out.println();

		Computer com = new Computer();
		System.out.println(com.areaCircle(r)); // �ڼ� Ŭ���� Computer() �޼ҵ�

	}

}
