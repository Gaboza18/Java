package ForPractice;

import java.util.Scanner;

public class Main10871 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // 입력받을 첫번째수 N 선언
		int X = scanner.nextInt(); // 입력받을 두번째수 X 선언
		int arr[] = new int[N]; // N길이의 배열 선언

		for (int i = 0; i < N; i++) { // N개의 배열을 저장하기 위한 조건
			arr[i] = scanner.nextInt(); // 0번째 배열부터 ~ N번째 까지의 배열에 입력값 저장
		}
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) { // 0번째 배열의 값과 입력한 X값과 비교
				System.out.print(arr[i] + " "); // 한줄에 입력하기 위해 print문 작성

			}
		}
	}
}
