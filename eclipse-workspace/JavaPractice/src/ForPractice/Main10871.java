package ForPractice;

import java.util.Scanner;

public class Main10871 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // �Է¹��� ù��°�� N ����
		int X = scanner.nextInt(); // �Է¹��� �ι�°�� X ����
		int arr[] = new int[N]; // N������ �迭 ����

		for (int i = 0; i < N; i++) { // N���� �迭�� �����ϱ� ���� ����
			arr[i] = scanner.nextInt(); // 0��° �迭���� ~ N��° ������ �迭�� �Է°� ����
		}
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) { // 0��° �迭�� ���� �Է��� X���� ��
				System.out.print(arr[i] + " "); // ���ٿ� �Է��ϱ� ���� print�� �ۼ�

			}
		}
	}
}
