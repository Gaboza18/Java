package WhilePractice;

import java.util.Scanner;

public class Main10952 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			int number1 = scanner.nextInt();
			int number2 = scanner.nextInt();

			if (number1 == 0 && number2 == 0) {
				scanner.close();
				break;
			}
			System.out.println(number1 + number2);
		}
	}
}
