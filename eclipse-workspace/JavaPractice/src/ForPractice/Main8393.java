package ForPractice;

import java.util.Scanner;

public class Main8393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt(); // 더하고 싶은 값 입력
		int sum = 0; // 1~더하고 싶은 값 총합 선언

		for (int i = 1; i <= number; i++) { // 1부터 입력한 값 까지 증가
			sum += i; // sum+i
		}
		System.out.println(sum); // 1~더하고 싶은 값 총합 출력
	}
}
