package IfElsePractice;

import java.util.Scanner; // ���ⱸ�ϴ� ����

public class Main2753 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int year;
		year = scanner.nextInt();

		if (year % 4 == 0) { // 4�� ��� �϶�
			if (year % 400 == 0) // 400�� ��� �϶�
				System.out.println("1");
			else if (year % 100 == 0) // 100�� ����϶�
				System.out.println("0");
			else
				System.out.println("1");
		} else { // 4�� ����� �ƴҶ�
			System.out.println("0");
		}
	}
}
