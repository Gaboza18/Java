package October_15_Friday_Homework;

public class Number1_Homework { // 1~100���� ���� �� ���ڸ��� ���ڷ� ������ ���� ã�� �� �ڸ����� ���� ���ϴ� ���α׷�

	public static void main(String[] args) {

		for (int number = 1; number < 100; number++) { // 1<=number<=99 ���
			if (number >= 10 && number <= 99) { // 10<=number<=99 �� ���
				System.out.println(
						number + ", " + (number / 10) + "+" + (number % 10) + "=" + ((number / 10) + (number % 10)));

				// number, (number�� 10���� ���� ��) + (number�� 10���� ���� ������) = ��� �������� ���� ��
			}
		}
	}
}
