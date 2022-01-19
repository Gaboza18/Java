package October_15_Friday_Homework;

import java.util.Scanner;

public class Number3_Homework { // 키보드에서 자연수 n을 입력 -> n이 짝수: n 나누기 2, n이 홀수: n 곱하기 3 +1
								// 결과가 1이 나올때 까지 반복

	public static void main(String[] args) {

		int number = 0; // 입력할 숫자 선언
		System.out.printf("시작할 숫자를 입력하세요: "); // 키보드로 부터 자연수 n입력 받는다
		Scanner input = new Scanner(System.in); // Scanner문
		number = input.nextInt(); // Scanner문
		System.out.printf(number + " "); // 시작한 첫번째 숫자 출력

		do {
			if (number % 2 == 0) { // 입력받은수가 '짝수' 일때
				number = number / 2; // 2로 나눈다.
			} else if (number % 2 == 1) { // 입력받은수가 '홀수' 일때
				number = number * 3 + 1; // 3으로 곱한후 1을 더한다.
			}
			System.out.printf(number + " "); // 결과값 1행에 출력
		} while (number != 1); // 결과값이 1이 나오면 while문 탈출
		
		input.close(); // Scanner문 닫는다.
	}
}