package sec10_method_overloading_Practice;

class DisplayInfo_Practice {

	// 문자 출력 메소드
	public void displayChar(char c) {
		System.out.println("문자를 출력하는 메소드: " + c);
	}

	// 문자열을 출력하는 메소드
	public void displayString(String str) {
		System.out.println("문자열을 출력하는 메소드: " + str);
	}

	// 숫자를 출력하는 메소드
	public void displayInt(int number) {
		System.out.println("숫자를 출력하는 메소드: " + number);
	}
}

public class OverloadTest_Practice {
	public static void main(String[] args) {

		DisplayInfo_Practice d1 = new DisplayInfo_Practice();

		d1.displayChar('a');
		d1.displayString("안녕히 가세요.");
		d1.displayInt(4321);
	}

}
