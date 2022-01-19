package exercise;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");

		int mark = input.nextInt();

		if (mark % 2 == 0) {
			System.out.println("입력하신 정수는 '짝수' 입니다.");
		} else {
			System.out.println("입력하신 정수는 '홀수' 입니다.");
		}
		System.out.println("bye!");
	}
}