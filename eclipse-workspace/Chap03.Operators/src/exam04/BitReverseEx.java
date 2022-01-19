package exam04;

public class BitReverseEx { // 비트전환연산
	public static void main(String[] args) {
		int value1 = 10; // value = 10
		int value2 = ~value1; // value값의 보수
		int value3 = value2 + 1;// value값의 보수에서 1을 더함

		System.out.println("value1= " + value1 + "(2진수: " + toBinary(value1) + ")"); // value의 초기값
		System.out.println("value2= " + value2 + "(2진수: " + toBinary(value2) + ")"); // value의 보수
		System.out.println("value3= " + value3 + "(2진수: " + toBinary(value3) + ")"); // value의 음수값(최종)
	}

	/*
	 * 입력한 정수를 2진수로 변환하는 메소드
	 */

	public static String toBinary(int value) {
		String str = Integer.toBinaryString(value); // value 정수를 이진수의 문자열로 변환

		while (str.length() < 32) { // string 값이 32자리가 되지않을때 while문
			str = "0" + str; // 32자리가 될때가지 0을 증가시킨다.
		}
		return str;
	}
}