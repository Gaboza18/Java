package exercise;

import java.util.Scanner;

public class ArrayEx2 { // �л����� �Է¹޾� �л�����ŭ ������ �Է¹ް�, �հ�,��� ���

	public static void main(String[] args) {

		int student = 0; // �л��� ���� ���� ����
		int[] score; // ���� �迭 ����
		int sum = 0; // ���� �հ� ����
		Scanner sc = new Scanner(System.in); // ScannerŸ�� �Է¹޴´�.
		
		System.out.printf("�л����� �Է��ϼ���: "); // ScannerŸ�� �Է¹޴´�.
		student = sc.nextInt();

		score = new int[student]; // �л��� ��ŭ �迭 ����

		int i = 0;
		while (i < student) { // �л� n���� ���� ����ϴ� while��, �Է��� �л��� ��ŭ �ݺ��Ѵ�.
			do {
				System.out.printf("�л� %d�� ����: ", (i + 1));
				score[i] = sc.nextInt();
				
				if (score[i] < 0 || score[i] > 100) { //0~100���� ������ �Է����� ������ �ٽ� �Է��� �޴´�.
					System.out.println("0~100���� ������ �Է��ϼ���.");
				}
			} while (score[i] < 0 || score[i] > 100); // 0~100���� ������ �Է����� ������ �ٽ� �Է��Ѵ�
			sum += score[i]; // �Է��� �������� �迭�� �հ迡 �����Ѵ�.
			i++; //�Է��� �л����� �����Ҷ� ���� �����Ѵ�.
		}
		System.out.println("�л����� ���� ����: " + sum);
		System.out.println("�л����� �������: " + (float) (sum / student));
	}
}
