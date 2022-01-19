package WhilePractice;

import java.util.Scanner;

public class Main10951 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {

			int number1 = scanner.nextInt();
			int number2 = scanner.nextInt();
			System.out.println(number1 + number2);
		}
		scanner.close();
	}
}