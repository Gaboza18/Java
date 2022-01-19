package exam04;

public class BreakExample { // break문

	public static void main(String[] args) {

		int number = 0;
		int sum = 0;

		while (true) { // 조건이 true이므로 무한 반복됨
			if (sum > 100)
				break; // 합계가 100보다 크면 while문을 빠져 나간다.
			number++;
			sum += number;
		}
		System.out.printf("number=%d, sum=%d\n", number, sum); // number = 14 일때 sum = 105이므로 while문 탈출
	}
}