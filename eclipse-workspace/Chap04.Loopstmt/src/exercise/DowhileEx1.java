package exercise;

import java.util.Scanner;

public class DowhileEx1 { // 1~100사이 컴퓨터가 생성하는 랜덤숫자를 사람이 입력하여 맞추는 문제
	public static void main(String[] args) {

		int HumanNumber = 1; // 사람이 입력하는 수 선언
		int PCNumber = (int) (Math.random() * 100) + 1; // 1<=PCnumber<100.99999999

		do {
			System.out.printf("두자리의 정수를 입력: "); // scanner문을 활용하여 입력전 문장 출력
			Scanner input = new Scanner(System.in); // scanner문
			HumanNumber = input.nextInt(); // scanner문

			if (PCNumber > HumanNumber) { // 사용자와 컴퓨터가 생성한 랜덤수 비교
				System.out.println("보다 더'큰'수를 입력하세요"); // +
			} else if (PCNumber < HumanNumber) {
				System.out.println("보다 더'작은'수를 입력하세요"); // -
			} else {
				System.out.println("정답입니다! (프로그램을 종료합니다.)"); // =
			}
		} while (HumanNumber != PCNumber); // 사용자가 입력한수 = 컴퓨터 랜덤숫자 될때까지 반복

	}

}