package exam02;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {

		int user_type;
		user_type = 1; // 0: 일반 사용자 1: 관리자 2: 손님

		/*
		 * Scanner input = new Scanner(System.in); System.out.print("로그인할 코드를 입력하세요: ");
		 * int user_type = input.nextInt(); // 0: 일반 사용자 1: 관리자 2: 손님
		 */

		switch (user_type) { // 변수만 입력
		case 0: // user_type이 '0' 일경우
			System.out.println("일반 사용자 입니다.");
			break;
		case 1: // user_type이 '1' 일경우
			System.out.println("관리자 입니다.");
			break;
		case 2: // user_type이 '2' 일경우
			System.out.println("손님 입니다.");
			break;
		default: // user_type이 '0~1' 이외 일경우
			System.out.println("잘못된 사용자 입니다.");
		}
	}
}
