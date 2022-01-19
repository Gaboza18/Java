package October_15_Friday_Homework;

public class Number1_Homework { // 1~100사이 숫자 중 두자리의 숫자로 구성된 수를 찾아 각 자리수의 합을 구하는 프로그램

	public static void main(String[] args) {

		for (int number = 1; number < 100; number++) { // 1<=number<=99 출력
			if (number >= 10 && number <= 99) { // 10<=number<=99 만 출력
				System.out.println(
						number + ", " + (number / 10) + "+" + (number % 10) + "=" + ((number / 10) + (number % 10)));

				// number, (number을 10으로 나눈 몫) + (number을 10으로 나눈 나머지) = 몫과 나머지를 더한 값
			}
		}
	}
}
