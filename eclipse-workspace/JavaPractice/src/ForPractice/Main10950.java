package ForPractice;

import java.util.Scanner;

public class Main10950 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt(); // ���ϰ� ���� ������ ���� �Է�
		int arr[] = new int[number]; // ���ϰ� ���� ���� ��ŭ �迭�� ����

		for (int i = 0; i < number; i++) { // ���ϰ� ���� ���ڸ�ŭ�� ���� �ۼ�

			int number2 = scanner.nextInt(); // ���� ���� ����1
			int number3 = scanner.nextInt(); // ���� ���� ����2

			arr[i] = number2 + number3; // ���� ���� �迭�� ����
		} // ������ �����Ǹ� for�� Ż��
		for (int i = 0; i < number; i++) { // ���� ���� �迭�� ���
			System.out.println(arr[i]);

		}
	}
}
