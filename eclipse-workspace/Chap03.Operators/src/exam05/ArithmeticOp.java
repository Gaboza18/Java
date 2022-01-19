package exam05;

public class ArithmeticOp { // 산술연산자
	public static void main(String[] args) {

		int value1 = 14;
		int value2 = 5;
		int result = 0;

		result = value1 + value2;
		System.out.println("덧셈: " + result);
		result = value1 - value2;
		System.out.println("뺄셈: " + result);
		result = value1 * value2;
		System.out.println("곱셈: " + result);
		result = value1 / value2; // 정수 나누기 정수 = 정수
		System.out.println("나눗셈(몫): " + result);
		result = value1 % value2; // 나머지 연산자, N의배수를 찾을때 많이사용
		System.out.println("나눗셈(나머지): " + result);

		double result2 = (double) value1 / value2; // value1 타입이 double로 바뀌면 value2도 자동으로 변환된다.
		System.out.println("나눗셈(실수): " + result2);

		/*
		 * int 보다 작은 타입의 산술연산
		 */

		short s = 100;
		byte b = 50;

		result = s + b; // short나 byte는 게산전에 int타입으로 자동변환
		short s2 = (short) (s + b); // 계산결과를 short로 유지하고 싶으면 short로 타입변환 해준다.
		System.out.println("덧셈(int 변환): " + result);
		System.out.println("덧셈(short 변환): " + s2);

		/*
		 * char 타입의 산술연산
		 */

		char c1 = 'A' + 1; // A= 65
		System.out.println("c1= " + c1);

		char c2 = 'A';
		// char c3 = c2 + 1; // c2가 int 타입으로 변환후에 산술연산 수행하므로 char형 변수에 저장 불가능하다.
		int result3 = c2 + 1; // char값 A=65를 Int 값으로 출력한다.(문자열 -> 숫자열로 변환)
		System.out.println("c2= " + result3);

		c2 = ++c1; // char 타입의 변수를 증감연산자 사용시 형변환이 일어나지 않음.
		System.out.println("c2= " + c2);

		/*
		 * 문자 리터널의 산술 연산
		 */

		int i = 'B' - 'A'; // B = 66, A = 65 // * ASCII 코드참조
		System.out.println("i: " + i);

		i = '2' - '0'; // '2' = 82 '0' = 80 // * ASCII 코드참조
		System.out.println("'2'-'0': " + i);

		/*
		 * 나머지 연산결과의 부호
		 */

		System.out.println("10 % 8 = " + (10 % 8)); // (+) % (+) = (+)
		System.out.println("10 % -8 = " + (10 % -8)); // (+) % (-) = (+)
		System.out.println("-10 % 8 = " + (-10 % 8)); // (-) % (+) = (-)
		System.out.println("-10 % -8 = " + (-10 % -8)); // (-) % (-) = (-)
	}
}
