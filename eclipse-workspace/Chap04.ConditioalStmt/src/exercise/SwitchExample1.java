package exercise;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.printf("확인하고 싶은 계절의 '월'을 입력: ");
		
		int season = input.nextInt();

		switch (season) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 '봄' 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재 계절은 '여름' 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재 계절은 '가을' 입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("현재 계절은 '겨울' 입니다.");
			break;
		default:
			System.out.println("입력오류 입니다. (1~12월 중 입력하세요.)");
		}

	}

}