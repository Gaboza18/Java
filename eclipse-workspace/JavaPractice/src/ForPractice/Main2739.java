package ForPractice;

import java.util.Scanner;

public class Main2739 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt(); // ����ϰ� ���� �������� ���� �Է�

		for (int i = 1; i < 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}

	}

}
