package exam01;

import java.util.Scanner;

public class NestedIfExample {
	public static void main(String[] args) {

		int score = 0;
		String grade;
		Scanner sc = new Scanner(System.in);

		System.out.printf("���� �Է�: ");
		score = sc.nextInt(); // ȭ�鿡�� ���ڸ� �޴´�.
		System.out.println();
		System.out.println("--------���--------");
		
		// ������ 0���� 100�������� �Ǵ�
		if (score >= 0 && score <= 100) {
			System.out.printf("����: %d\n", score);

			if (score >= 90) {
				if (score >= 95) {
					grade = "A+";
				} else {
					grade = "A0";
				}
			} else if (score >= 80) {
				if (score >= 85) {
					grade = "B+";
				} else {
					grade = "B0";
				}
			} else {
				grade = "C";
			}
			System.out.printf("����� �����: %s �Դϴ�.\n", grade);
			System.out.println("-------------------");
		}else {
			System.out.println("�߸��� ������ �Է��߽��ϴ�.(����� �ϼ��� F11 Ŭ��)");
			System.out.println("-------------------");
		}
		
	}

}
