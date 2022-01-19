package exam10;

public class ShiftOp { // 쉬프트 연산자(<<, >>, >>>)

	public static void main(String[] args) {

		int dec = 12; // 양수값(+)
		System.out.println("dec=" + dec + "    (" + toBinary(dec) + ")");
		System.out.println("dec<<1=" + (dec << 1) + " (" + toBinary(dec << 1) + ")"); // dec의 값을 한번 왼쪽으로 shift
		System.out.println("dec<<2=" + (dec << 2) + " (" + toBinary(dec << 2) + ")"); // dec의 값을 두번 왼쪽으로 shift
		System.out.println("dec>>1=" + (dec >> 1) + " (" + toBinary(dec << 1) + ")"); // dec의 값을 한번 오른쪽으로 shift
		System.out.println("dec>>2=" + (dec >> 2) + " (" + toBinary(dec << 2) + ")"); // dec의 값을 두번 오른쪽으로 shift
		System.out.println("");

		dec = -12; // 음수값(-)
		System.out.println("dec=" + dec + "    (" + toBinary(dec) + ")");
		System.out.println("dec<<1=" + (dec << 1) + " (" + toBinary(dec << 1) + ")"); // dec의 값을 한번 왼쪽으로 shift
		System.out.println("dec<<2=" + (dec << 2) + " (" + toBinary(dec << 2) + ")"); // dec의 값을 두번 왼쪽으로 shift
		System.out.println("dec>>1=" + (dec >> 1) + " (" + toBinary(dec << 1) + ")"); // dec의 값을 한번 오른쪽으로 shift
		System.out.println("dec>>2=" + (dec >> 2) + " (" + toBinary(dec << 2) + ")"); // dec의 값을 두번 오른쪽으로 shift
	}

	public static String toBinary(int value) { // 2진수 구하는 메소드
		String str = Integer.toBinaryString(value); // value 정수를 이진수의 문자열로 변환

		while (str.length() < 32) { // string 값이 n자리가 되지않을때 while문
			str = "0" + str; // n자리가 될때가지 0을 증가시킨다.
		}
		return str;
	}
}
