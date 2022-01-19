package October_15_Friday_Homework;

public class Number2_Homework { // 1~100까지 총합, 평균 계산

	public static void main(String[] args) {

		int sum = 0; // 총합을 저장
		double average = 0; // 평균값 선언

		for (int number = 1; number <= 100; number++) { // 1~100까지 더하는 for문
			sum += number; // 1부터 100까지 더하여 sum에 저장한다.
			average = sum / 100.0; // 1~n까지 총합을 n으로 나누어 평균(double)형으로 도출
		}
		System.out.println("1~100까지 합: " + sum); 
		System.out.printf("1~100까지 평균: %.2f ", average); // %.2f(소수점 2자리 까지 출력)
	}
}