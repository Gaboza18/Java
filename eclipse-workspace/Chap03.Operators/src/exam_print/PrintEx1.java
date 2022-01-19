package exam_print;

public class PrintEx1 {

	public static void main(String[] args) {

		byte b = 1;
		short s = 2;
		char c = 'A';
		int finger = 10;
		String str = "Java";

		System.out.printf("byte는 %d\n", b);
		System.out.printf("short는 %d\n", s);
		System.out.printf("char는 %c (%d)\n", c, (int) c); // char 값을 int 값으로 형변환 해야 출력가능.
		System.out.printf("당신의 손가락은 [%5d]개 입니다.\n", finger); // %nd = 앞n칸 공백.
		System.out.printf("당신의 손가락은 [%-5d]개 입니다.\n", finger); // %-nd = 뒤n칸 공백.
		System.out.printf("당신의 손가락은 [%05d]개 입니다.\n", finger); // %0nd = 앞n칸 0으로 채운다.
		/*
		 * 큰 수의 출력
		 */
		long big = 100_000_000_000L;
		System.out.printf("big은 %d\n", big);
		/*
		 * 8(0),16(0x)진수의 출력
		 */
		int octNum = 010; // 8진수 / 10진수: 8
		int hexNum = 0x10; // 16진수 / 10진수: 16
		System.out.printf("8진수 %#o, 10진수 %d\n", octNum, octNum); // 8진수 출력(%#o)
		System.out.printf("16진수 %#x, 10진수 %d\n", hexNum, hexNum); // 16진수 출력(%#x)
		/*
		 * 문자열 출력
		 */
		System.out.printf("문자열은 %s\n", str); // 문자열 출력(%s)
		/*
		 * 문자열 자리수 지정
		 */
		System.out.printf("문자열은 [%10s]\n", str); // 문자열 출력(%s), 10자리 띄우고 출력(앞)
		System.out.printf("문자열은 [%-10s]\n", str); // 문자열 출력(%s), 10자리 띄우고 출력(뒤)
		System.out.printf("문자열은 [%.3s]\n", str); // 3글자만 출력
		System.out.printf("백분율: 80%%"); // % 출력
	}

}