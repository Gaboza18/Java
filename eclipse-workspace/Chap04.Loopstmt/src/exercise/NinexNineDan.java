package exercise;

import java.util.Scanner;

public class NinexNineDan {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("����ϰ� ���� �������� ���� �Է�: ");

		int number = input.nextInt();
		System.out.println("");
		System.out.println("----" + number + "��----");
		for (int i = 1; i < 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		System.out.println("------------");
	}
}
