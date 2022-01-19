package exam01;

public class ForSumExample2 {
	public static void main(String[] args) {

		int sum = 0; // 합계를 저장할 변수
		for (int number = 1; number <= 10; number++) {
			sum += number; // 현재까지의 합계에 number값을 더한다(sum = sum + number)
		}
		System.out.println("1~10까지의 합계: " + sum);
	}

}
