package IfElsePractice;

import java.util.Scanner;

public class Main14681 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();

		if ((x > 0) && (y > 0)) {
			System.out.println("1");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("2");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("3");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("4");
		}

	}
}
