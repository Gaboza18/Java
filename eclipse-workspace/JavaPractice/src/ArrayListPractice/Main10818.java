package ArrayListPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {

		System.out.printf("����� �迭�� ������ �Է�: ");
		Scanner in = new Scanner(System.in);
		int Number = in.nextInt();

		int[] arr = new int[Number];

		for (int i = 0; i < Number; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);
		System.out.println("�ּҰ�: " + arr[0] + ", �ִ밪: " + arr[Number - 1]);

	}

}
