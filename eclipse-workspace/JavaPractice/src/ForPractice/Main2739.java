package ForPractice;

import java.util.Scanner;

public class Main2739 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt(); // 출력하고 싶은 구구단의 단을 입력

		for (int i = 1; i < 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}

	}

}
