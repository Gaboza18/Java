package exam09;

public class LogicalOp {
	public static void main(String[] args) {
		int x = 100; // x값은 숫자만 입력
		boolean result, result2;

		result = (x >= 10 && x <= 20);
		System.out.println("x값이 10과 같거나 크고 20보다 작거나 같습니까? " + result);
		System.out.println("");

		result = (x % 2 == 0);
		System.out.println("x값이 2의배수 입니까? " + result);
		System.out.println("");

		result = (x % 2 == 0 || x % 3 == 0);
		System.out.println("x값이 2의배수 또는 3의배수 입니까? " + result);
		System.out.println("");

		/*
		 * ch의 값이 대,소문자인지 판단
		 */

		char ch = 'F'; // ch값은 '알파벳'만 입력
		result = (ch >= 'a' && ch < 'z');
		System.out.println("ch값이 소문자 입니까? " + result);
		System.out.println("");

		result2 = (ch >= 'A' && ch < 'Z');
		System.out.println("ch값이 대문자 입니까? " + result2);
		System.out.println("");
	}
}
