package ForPractice;

import java.util.Scanner;

public class Main8393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt(); // ���ϰ� ���� �� �Է�
		int sum = 0; // 1~���ϰ� ���� �� ���� ����

		for (int i = 1; i <= number; i++) { // 1���� �Է��� �� ���� ����
			sum += i; // sum+i
		}
		System.out.println(sum); // 1~���ϰ� ���� �� ���� ���
	}
}
