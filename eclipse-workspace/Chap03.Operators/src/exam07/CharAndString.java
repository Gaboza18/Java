package exam07;

public class CharAndString {

	public static void main(String[] args) {
		char ch = 'A'; // 올바른 경우(' ' 문자 하나만 포함이되어야 한다.)
		// char ch2 = 'AB'; // 잘못된 경우(' ' 문자 두개이상이 포함된경우)
		// ch = ' '; // char형 변수에는 빈 문자를 넣을수 없다.
		System.out.println("문자하나만 표현: " + ch);

		String s1 = "AB"; // 문자 2개 이상은 문자열 이라함. " " 포함)
		System.out.println("문자 2개이상 표현: " + s1);

		s1 = " "; // String형 변수에는 빈 문자를 넣을수 있다.
		System.out.println("공백 표현: " + s1);

		/*
		 * 문자열+연산
		 */

		String str1 = "JDK" + 11;
		System.out.println("문자열+연산: " + str1);

		String str2 = "Java" + 7 + 7;
		System.out.println("문자열+연산+연산: " + str2);

		String str3 = 3 + 3 + "JDK";
		System.out.println("연산+연산+문자열: " + str3);

		String str4 = 3.0 + 3 + "JDK"; // 3.0 = double형, 3.0f = float형
		System.out.println("연산(double)+연산+문자열: " + str4);

	}

}