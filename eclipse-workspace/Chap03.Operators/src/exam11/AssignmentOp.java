package exam11;

public class AssignmentOp { // ���Կ�����

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;

		number1 += 4; // number1 = number1+4
		number2 -= 4; // number2 = number2-4

		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);

		number1 *= 2; // number1 = number1*2 (�ʱⰪ�� �ƴ� ���� +�� ����� �Ŀ� * ����)
		System.out.println("number1: " + number1);

		number2 /= 2; // number1 = number1/2 (�ʱⰪ�� �ƴ� ���� -�� ����� �Ŀ� / ����)
		System.out.println("number1: " + number2);
	}

}