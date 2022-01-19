package ForPractice;

import java.util.Scanner;

public class Main11022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int arr[] = new int[number];
		int number2[] = new int[number];
		int number3[] = new int[number];

		for (int i = 0; i < number; i++) {

			number2[i] = scanner.nextInt();
			number3[i] = scanner.nextInt();
			arr[i] = number2[i] + number3[i];

		}
		for (int i = 0; i < number; i++) {
			System.out.println("Case #" + (i + 1) + ": " + number2[i] + " + " + number3[i] + " = " + arr[i]);
		}
	}
}
