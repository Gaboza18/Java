package sec01.nested_class;

public class NestedTest {

	public static void main(String[] args) {
		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		A a = new A();
		A.B b = a.new B();

		b.field1 = 5;
		b.method1();
		// A.B.field2 = 2;
		// A.B.method2();

		// ������ ��� Ŭ���� ��ü ����
		A.C c = new A.C();

		c.field1 = 5;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();

		a.method();
	}

}
