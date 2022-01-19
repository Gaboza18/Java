
public class StringExample1 {

	public static void main(String[] args) {

		String str1 = new String("Java Program");
		String str2 = new String("Java Programs");

		// charAt() : 문자열에서 지정한 위치의 문자값을 얻어오는 기능

		str1.charAt(5); // str 값에서 5번째 값을 찾는다
		System.out.println("str1의 0번 인덱스 값: " + str1.charAt(0));
		System.out.println("str1의 1번 인덱스 값: " + str1.charAt(1));
		System.out.println("str1의 2번 인덱스 값: " + str1.charAt(2));
		System.out.println("str1의 3번 인덱스 값: " + str1.charAt(3));
		System.out.println("str1의 4번 인덱스 값: " + str1.charAt(4));
		System.out.println("str1의 5번 인덱스 값: " + str1.charAt(5));
		System.out.println("str1의 6번 인덱스 값: " + str1.charAt(6));
		System.out.println("str1의 7번 인덱스 값: " + str1.charAt(7));
		System.out.println("str1의 8번 인덱스 값: " + str1.charAt(8));
		System.out.println("str1의 9번 인덱스 값: " + str1.charAt(9));
		System.out.println("str1의 10번 인덱스 값: " + str1.charAt(10));
		System.out.println("str1의 11번 인덱스 값: " + str1.charAt(11));

		// length() : 문자열의 길이
		System.out.println("");
		System.out.println("str1의 길이: " + str1.length());
		// 부분 문자열
		System.out.println("");
		String substr = str1.substring(0); // 부분문자열의 시작 인덱스 값만 지정, n번이후부터 출력시작
		System.out.println("substr= " + substr);

		String substr2 = str1.substring(0, 9); // 끝 인덱스의 문자는 포함 안함. (n1, n2) n1이후부터 출력후 n2부터 출력안함
		System.out.println("substr2= " + substr2);

		// equals(): 문자열의 '주소값', '내용'이 같은지 비교
		System.out.println("");
		if (str1 == str2) {
			System.out.println("문자열의 '주소값'이 같습니다.");
		} else {
			System.out.println("문자열의 '주소값'이 같지 않습니다.");
		}

		if (str1.equals(str2)) {
			System.out.println("문자열의 '내용'이 같습니다.");
		} else {
			System.out.println("문자열의 '내용'이 다릅니다.");
		}

	}
}
