package WhilePractice;

import java.util.Scanner;

public class Main1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int Number = scanner.nextInt(); // 입력값

		int count = 0; // 입력한 값과 새로운 입력값이 같아지기 위해 사이클을 돌릴 횟수
		int NewNumber = Number; // 입력값(Number)의 새로운값(Newnumber)

		while (true) {
			Number = ((Number % 10) * 10 + (((Number / 10) + (Number % 10)) % 10));
			count++;

			if (NewNumber == Number) { // 기존에 입력한 입력값 과 새로운 입력값이 같을경우 break.
				break;
			}
		}
		System.out.println(count); // 기존에 입력한 입력값 과 새로운 입력값이 같을경우 사이클 돈 횟수 출력
	}
}
