package sec10_method_overloading;

/*
 * 메소드 오버로드를 사용하여 정의하는 방법
 */

class DisplayInfo2 { // 같은 패키지 안에 같은 클래스 x

	// 문자
	public void dispChar(char c) { // 메소드 이름이 동일해도 오류가 없다
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

	// 문자, 숫자
	public void dispInt(String msg, int number) { // 메소드 오버로딩(동일한 메소드값)
		System.out.println(msg + number);
	}
}

public class OverloadTest2 {
	public static void main(String[] args) {

		DisplayInfo2 d1 = new DisplayInfo2();
		// 문자 출력
		d1.dispChar('A');

		// d1.disp("abc"); // String형을 입력파라미터로 사용불가

		// 문자열 출력
		d1.dispString("안녕");

		// 숫자 출력
		d1.dispInt(123456);
		
		//문자열, 숫자 출력
		d1.dispInt("계산결과는", 123);
	}

}
