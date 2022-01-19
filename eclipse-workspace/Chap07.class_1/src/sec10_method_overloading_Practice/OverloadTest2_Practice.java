package sec10_method_overloading_Practice;

class DisplayInfo2_Practice {

	public void displayChar(char c) {
		System.out.println("오버로딩 하지 않은 문자: " + c);
	}

	public void displayString(String str) {
		System.out.println("오버로딩 하지 않은 문자열: " + str);
	}

	public void displayInt(int number) {
		System.out.println("오버로딩 하지 않은 숫자: " + number);
	}

	public void displayInt(String str2, int number) { // 오버로딩 조건: 메소드 이름이 동일, 타입변수, 개수, 순서가 달라야 함
		System.out.println("오버로딩 한 문자열 과 숫자: " + str2 + " " + number);
	}

}

public class OverloadTest2_Practice {
	public static void main(String[] args) {

		DisplayInfo2_Practice d1 = new DisplayInfo2_Practice();

		d1.displayChar('F');
		d1.displayString("반갑지 않습니다.");
		d1.displayInt(666666);
		d1.displayInt("잘가세요", 888888);
	}

}
