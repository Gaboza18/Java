package exam01;

public class IfElseIfExample {

	public static void main(String[] args) {
		int number = -5;

		if (number > 0) { // 문장이 하나일 경우 '{' 생략가능 두개 이상이면 생략 불가능
			System.out.println("입력하신 숫자는 '양수' 입니다");
		} else if (number == 0) {
			System.out.println("입력하신 숫자는 '0' 입니다");
		} else {
			System.out.println("입력하신 숫자는 '음수' 입니다");
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
