package exam01;

import java.util.Scanner;

public class NestedIfExample {
	public static void main(String[] args) {

		int score = 0;
		String grade;
		Scanner sc = new Scanner(System.in);

		System.out.printf("점수 입력: ");
		score = sc.nextInt(); // 화면에서 숫자를 받는다.
		System.out.println();
		System.out.println("--------결과--------");
		
		// 점수가 0에서 100사이인지 판단
		if (score >= 0 && score <= 100) {
			System.out.printf("점수: %d\n", score);

			if (score >= 90) {
				if (score >= 95) {
					grade = "A+";
				} else {
					grade = "A0";
				}
			} else if (score >= 80) {
				if (score >= 85) {
					grade = "B+";
				} else {
					grade = "B0";
				}
			} else {
				grade = "C";
			}
			System.out.printf("당신의 등급은: %s 입니다.\n", grade);
			System.out.println("-------------------");
		}else {
			System.out.println("잘못된 점수를 입력했습니다.(재실행 하세요 F11 클릭)");
			System.out.println("-------------------");
		}
		
	}

}
