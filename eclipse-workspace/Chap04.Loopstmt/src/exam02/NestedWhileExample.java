package exam02;

public class NestedWhileExample { // while ���� �̿��� ������ �ۼ�

	public static void main(String[] args) {
		int number1 = 2; // �������� '��'���� ����

		while (number1 <= 9) { // �� �ܿ��� 1~9���� ���Ͽ� ����� ���
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
