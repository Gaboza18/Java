package sec16.field_method_access.package1;

public class B {
	public B() {
		A a = new A();
		// ���� ��Ű�� ������ �پ��� �����ڸ� ���� ���� ���
		// ��� ��밡��
		a.field1 = 1; // public (��� ����)
		a.field2 = 1; // default (��� ����)
		// a.field3 = 1; // private (A Ŭ������ ������ ��밡��)

		// ���� Ŭ���� ������ �پ��� �����ڸ� ���� �޼ҵ� ���
		// ��� ��밡��
		a.method1(); // public
		a.method2(); // default
		// a.method3(); // private (���� Ŭ���� ������ ���)
	}
}
