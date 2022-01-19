package exam08;

public class CompareEx { // 비교연산자

	public static void main(String[] args) {

		int a = 12;
		int b = 24;

		boolean result = (a == b); // a와 b가 같은가?

		System.out.println("a는 " + a);
		System.out.println("b는 " + b);
		System.out.println("a==b 결과는 " + result);
		System.out.println("");

		System.out.println("a는 " + a);
		System.out.println("b는 " + b);
		result = (a != b); // a와 b가 다른가?
		System.out.println("a != b 결과는 " + result);
		System.out.println("");

		System.out.println("a는 " + a);
		System.out.println("b는 " + b);
		result = (a >= b);
		System.out.println("a>=b 결과는 " + result);
		System.out.println("");

		char c1 = 'A';
		char c2 = 'B';
		result = (c1 < c2);
		System.out.println("c1<c2 결과는 " + result);
		System.out.println("");

		/*
		 * 0.1d과 0.1f 비교
		 */

		float f = 0.1f;
		double d = 0.1; // double형의 리터널
		result = (f == d);
		System.out.printf("f=%19.17f\n", f); // 19칸 출력 소수점 이하 17자리 출력
		System.out.printf("d=%19.17f\n", d); // float는 소수점 이하 8~9자리 까지만 정밀도 보장
		System.out.println("0.1f 와 0.1 같은가?: " + result);
		System.out.println("");

		/*
		 * 문자열의 주소값 비교
		 */

		String str1 = new String("abc");
		String str2 = new String("abc");
		result = (str1 == str2); // str1 과 str2 의 주소값이 같은가?
		System.out.println("str1 과 str2 같은가?(str1 == str2) " + result);
		System.out.println("");
		
		/*
		 * 문자열의 내용이 같은지 비교
		 */
		
		result = (str1.equals(str2));
		System.out.println("str1 과 str2 같은가?(str1.equals(str2)) " + result);
		System.out.println("");
	}

}