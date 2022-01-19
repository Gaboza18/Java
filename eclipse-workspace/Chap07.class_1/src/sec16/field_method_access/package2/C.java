package sec16.field_method_access.package2;

import sec16.field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();
		// 다른 패키지 내에서 다양한 제어자를 가진 변수 사용

		a.field1 = 1; // public (사용 가능)
		// a.field2 = 1; // default (사용 불가능, 같은 패키지에서만 접근가능)
		// a.field3 = 1; // private (사용 불가능, 같은 클래스내 에서만 접근가능)

		// 다른 패키지 내에서 다양한 제어자를 가진 메소드 사용

		a.method1(); // public (사용 가능)
		//a.method2(); // default (사용 불가능, 같은 패키지에서만 접근가능)
		//a.method3(); // private (사용 불가능, 같은 클래스내에서만 접근가능)
	}
}
