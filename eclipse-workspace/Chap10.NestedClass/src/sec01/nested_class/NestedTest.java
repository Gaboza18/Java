package sec01.nested_class;

public class NestedTest {

	public static void main(String[] args) {
		// 인스턴스 멤버 클래스 객체 생성
		A a = new A();
		A.B b = a.new B();

		b.field1 = 5;
		b.method1();
		// A.B.field2 = 2;
		// A.B.method2();

		// 정적인 멤버 클래스 객체 생성
		A.C c = new A.C();

		c.field1 = 5;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();

		a.method();
	}

}
