package sec16.constructor_access.package1;

public class A {
	// 멤버 변수
	A a1 = new A(true); // 같은 클래스 내에서 public 생성자 사용
	A a2 = new A(1); // 같은 클래스 내에서 default 생성자 사용
	A a3 = new A("Hello"); // 같은 클래스 내에서 private 생성자 사용

	// 생성자
	public A(boolean b) {
	}

	A(int b) {
	} // default 제어자의 생성자

	private A(String s) {
	} // private 제어자의 생성자
}