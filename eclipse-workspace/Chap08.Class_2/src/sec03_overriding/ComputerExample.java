package sec03_overriding; // 오버라이딩 조건 메소드 이름, 매개변수, 리턴타입 동일

class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}

class Computer extends Calculator {
	double areaCircle(double r) { // 오버라이팅: areaCircle() , double r, return Math.PI * r * r; 동일
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}

public class ComputerExample {

	public static void main(String[] args) {

		int r = 10; // 반지름

		Calculator cal = new Calculator();
		System.out.println(cal.areaCircle(r)); // 조상 클래스 Calculator() 메소드
		System.out.println();

		Computer com = new Computer();
		System.out.println(com.areaCircle(r)); // 자손 클래스 Computer() 메소드

	}

}
