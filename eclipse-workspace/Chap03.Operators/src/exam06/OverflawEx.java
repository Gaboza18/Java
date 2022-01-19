package exam06;
/*
 * 두 수의 계산 결과가 저장할 타입보다 크기가 큰 경우
 */
public class OverflawEx {

	public static void main(String[] args) {
		int a = 10_000_000; // = 100,000,000
		int b = 20_000_000;

		int c = (a * b);
		System.out.println("a*b의 결과는(int형): " + c); // 잘못된 출력값

		long d = (long) a * b;
		System.out.println("a*b의 결과는(long형): " + d); // 올바른 출력값
	}

}