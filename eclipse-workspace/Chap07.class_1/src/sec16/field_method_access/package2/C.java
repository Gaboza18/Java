package sec16.field_method_access.package2;

import sec16.field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();
		// �ٸ� ��Ű�� ������ �پ��� �����ڸ� ���� ���� ���

		a.field1 = 1; // public (��� ����)
		// a.field2 = 1; // default (��� �Ұ���, ���� ��Ű�������� ���ٰ���)
		// a.field3 = 1; // private (��� �Ұ���, ���� Ŭ������ ������ ���ٰ���)

		// �ٸ� ��Ű�� ������ �پ��� �����ڸ� ���� �޼ҵ� ���

		a.method1(); // public (��� ����)
		//a.method2(); // default (��� �Ұ���, ���� ��Ű�������� ���ٰ���)
		//a.method3(); // private (��� �Ұ���, ���� Ŭ������������ ���ٰ���)
	}
}
