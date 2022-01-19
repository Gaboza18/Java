package ForPractice;

import java.util.Scanner;

public class Main10950 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt(); // 더하고 싶은 숫자의 개수 입력
		int arr[] = new int[number]; // 더하고 싶은 숫자 만큼 배열에 저장

		for (int i = 0; i < number; i++) { // 더하고 싶은 숫자만큼의 조건 작성

			int number2 = scanner.nextInt(); // 더할 숫자 선언1
			int number3 = scanner.nextInt(); // 더할 숫자 선언2

			arr[i] = number2 + number3; // 더한 값을 배열에 저장
		} // 조건이 성립되면 for문 탈출
		for (int i = 0; i < number; i++) { // 더한 값의 배열을 출력
			System.out.println(arr[i]);

		}
	}
}
