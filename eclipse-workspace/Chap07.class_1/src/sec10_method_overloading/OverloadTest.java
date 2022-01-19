package sec10_method_overloading;

/*
 * 메소드 오버로드를 사용하지 않고 일반적인 메소드 정의 방법
 */

class DisplayInfo {
	
	// 문자
	public void dispChar(char c) {
		System.out.println(c);
	}

	// 문자열
	public void dispString(String str) {
		System.out.println(str);
	}

	// 숫자
	public void dispInt(int number) {
		System.out.println(number);
	}
}

public class OverloadTest {
	public static void main(String[] args) {

		DisplayInfo d1 = new DisplayInfo();
		// 문자 출력
		d1.dispChar('A');

		// d1.disp("abc"); // String형을 입력파라미터로 사용불가

		// 문자열 출력
		d1.dispString("안녕");

		// 숫자 출력
		d1.dispInt(123456);
	}

}
