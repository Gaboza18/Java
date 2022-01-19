package sec16.field_method_access.package1;

public class A {
	// 멤버변수
	public int field1;
	int field2; // default 제어자의 변수
	private int field3;

	public A() {
		// 같은 클래스 내에서 다양한 제어자를 가진 변수 사용
		// 모두 사용가능
		field1 = 1;
		field2 = 1;
		field3 = 1;

		// 같은 클래스 내에서 다양한 제어자를 가진 메소드 사용
		// 모두 사용가능
		method1();
		method2();
		method3();
	}

	// 메소드
	public void method1() {
	}

	void method2() {
	}

	private void method3() {
	}
}