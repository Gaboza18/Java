package exercise;

public class WhileEx1 { // 10이하의 3과 5의 배수 총합

	public static void main(String[] args) {

		int number = 1;
		int sum = 0; // 합을 저장하는 변수

		while (number <= 20) { // 1부터 10이 될때까지 증가
			number++;

			if (number % 3 == 0 || number % 5 == 0) { // 3의배수, 5의배수 조건
				sum += number; // 3의 배수, 5의배수 값을 sum에다 저장한다.
				System.out.printf("1~10사이 3과 5의 배수: %d\n", number); // 3과 5의배수 값 저장
			}
		}
		System.out.println("1~10사이 3과 5의 배수의 총합: " + sum); // 3과 5의배수 값의 총합 출력
	}
}