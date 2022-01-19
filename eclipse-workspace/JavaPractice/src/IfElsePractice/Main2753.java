package IfElsePractice;

import java.util.Scanner; // 윤년구하는 문제

public class Main2753 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int year;
		year = scanner.nextInt();

		if (year % 4 == 0) { // 4의 배수 일때
			if (year % 400 == 0) // 400의 배수 일때
				System.out.println("1");
			else if (year % 100 == 0) // 100의 배수일때
				System.out.println("0");
			else
				System.out.println("1");
		} else { // 4의 배수가 아닐때
			System.out.println("0");
		}
	}
}
