package WhilePractice;

import java.util.Scanner;

public class Main1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int Number = scanner.nextInt(); // �Է°�

		int count = 0; // �Է��� ���� ���ο� �Է°��� �������� ���� ����Ŭ�� ���� Ƚ��
		int NewNumber = Number; // �Է°�(Number)�� ���ο(Newnumber)

		while (true) {
			Number = ((Number % 10) * 10 + (((Number / 10) + (Number % 10)) % 10));
			count++;

			if (NewNumber == Number) { // ������ �Է��� �Է°� �� ���ο� �Է°��� ������� break.
				break;
			}
		}
		System.out.println(count); // ������ �Է��� �Է°� �� ���ο� �Է°��� ������� ����Ŭ �� Ƚ�� ���
	}
}
