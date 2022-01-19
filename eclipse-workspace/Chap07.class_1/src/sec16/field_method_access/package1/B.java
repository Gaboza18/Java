package sec16.field_method_access.package1;

public class B {
	public B() {
		A a = new A();
		// 같은 패키지 내에서 다양한 제어자를 가진 변수 사용
		// 모두 사용가능
		a.field1 = 1; // public (사용 가능)
		a.field2 = 1; // default (사용 가능)
		// a.field3 = 1; // private (A 클래스내 에서만 사용가능)

		// 같은 클래스 내에서 다양한 제어자를 가진 메소드 사용
		// 모두 사용가능
		a.method1(); // public
		a.method2(); // default
		// a.method3(); // private (같은 클래스 에서만 사용)
	}
}
