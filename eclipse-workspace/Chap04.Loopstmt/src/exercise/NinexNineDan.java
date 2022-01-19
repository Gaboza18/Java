package exercise;

import java.util.Scanner;

public class NinexNineDan {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("출력하고 싶은 구구단의 단을 입력: ");

		int number = input.nextInt();
		System.out.println("");
		System.out.println("----" + number + "단----");
		for (int i = 1; i < 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		System.out.println("------------");
	}
}
