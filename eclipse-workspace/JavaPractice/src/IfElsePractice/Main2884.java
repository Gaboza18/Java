package IfElsePractice;

import java.util.Scanner;

public class Main2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt(); // �Է��� �ð�
		int M = scanner.nextInt(); // �Է��� ��

		if (M < 45) { // �Է��� ���� 45���� �������
			H--; // �Է��� �ð����� 1�� ���ش�(���� ����ϱ� ���� �ð����� ������)
			M = 60 - (45 - M); // �ð����� ���� �� 60 - (45 - �Է��� ��)

			if (H < 0) { // ���� if���� �������� �Է��� �ð����� 0���� �۰ԵǸ� ����Ǵ� ����
				H = 23; // 00�� ���� 23:00 �� ��ȯ
			}
			System.out.println(H + " " + M);
		} else { // �Է��� ���� 45���� Ŭ ���
			System.out.println(H + " " + (M - 45));
		}
	}
}
