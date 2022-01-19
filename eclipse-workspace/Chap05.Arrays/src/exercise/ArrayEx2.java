package exercise;

import java.util.Scanner;

public class ArrayEx2 { // 학생수를 입력받아 학생수만큼 점수를 입력받고, 합계,평균 출력

	public static void main(String[] args) {

		int student = 0; // 학생수 저장 변수 선언
		int[] score; // 점수 배열 저장
		int sum = 0; // 점수 합계 저장
		Scanner sc = new Scanner(System.in); // Scanner타입 입력받는다.
		
		System.out.printf("학생수를 입력하세요: "); // Scanner타입 입력받는다.
		student = sc.nextInt();

		score = new int[student]; // 학생수 만큼 배열 생성

		int i = 0;
		while (i < student) { // 학생 n명의 점수 출력하는 while문, 입력한 학생수 만큼 반복한다.
			do {
				System.out.printf("학생 %d의 점수: ", (i + 1));
				score[i] = sc.nextInt();
				
				if (score[i] < 0 || score[i] > 100) { //0~100사이 점수를 입력하지 않으면 다시 입력을 받는다.
					System.out.println("0~100사이 점수를 입력하세요.");
				}
			} while (score[i] < 0 || score[i] > 100); // 0~100사이 점수를 입력하지 않으면 다시 입력한다
			sum += score[i]; // 입력한 점수들의 배열을 합계에 저장한다.
			i++; //입력한 학생수를 만족할때 까지 증가한다.
		}
		System.out.println("학생들의 점수 총합: " + sum);
		System.out.println("학생들의 평균점수: " + (float) (sum / student));
	}
}
