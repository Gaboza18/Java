package October_15_Friday_Homework;

import java.util.Scanner;

public class Number3_Homework { // Ű���忡�� �ڿ��� n�� �Է� -> n�� ¦��: n ������ 2, n�� Ȧ��: n ���ϱ� 3 +1
								// ����� 1�� ���ö� ���� �ݺ�

	public static void main(String[] args) {

		int number = 0; // �Է��� ���� ����
		System.out.printf("������ ���ڸ� �Է��ϼ���: "); // Ű����� ���� �ڿ��� n�Է� �޴´�
		Scanner input = new Scanner(System.in); // Scanner��
		number = input.nextInt(); // Scanner��
		System.out.printf(number + " "); // ������ ù��° ���� ���

		do {
			if (number % 2 == 0) { // �Է¹������� '¦��' �϶�
				number = number / 2; // 2�� ������.
			} else if (number % 2 == 1) { // �Է¹������� 'Ȧ��' �϶�
				number = number * 3 + 1; // 3���� ������ 1�� ���Ѵ�.
			}
			System.out.printf(number + " "); // ����� 1�࿡ ���
		} while (number != 1); // ������� 1�� ������ while�� Ż��
		
		input.close(); // Scanner�� �ݴ´�.
	}
}