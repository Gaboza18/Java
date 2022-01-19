package IfElsePractice;

import java.util.Scanner;

public class Main2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt(); // 입력한 시간
		int M = scanner.nextInt(); // 입력한 분

		if (M < 45) { // 입력한 분이 45보다 작을경우
			H--; // 입력한 시간에서 1을 빼준다(분을 계산하기 위해 시간에서 빌린값)
			M = 60 - (45 - M); // 시간에서 빌린 값 60 - (45 - 입력한 분)

			if (H < 0) { // 위에 if문을 실행한후 입력한 시간값이 0보다 작게되면 실행되는 조건
				H = 23; // 00시 에서 23:00 로 변환
			}
			System.out.println(H + " " + M);
		} else { // 입력한 분이 45보다 클 경우
			System.out.println(H + " " + (M - 45));
		}
	}
}
