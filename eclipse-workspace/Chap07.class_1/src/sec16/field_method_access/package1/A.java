package sec16.field_method_access.package1;

public class A {
	// �������
	public int field1;
	int field2; // default �������� ����
	private int field3;

	public A() {
		// ���� Ŭ���� ������ �پ��� �����ڸ� ���� ���� ���
		// ��� ��밡��
		field1 = 1;
		field2 = 1;
		field3 = 1;

		// ���� Ŭ���� ������ �پ��� �����ڸ� ���� �޼ҵ� ���
		// ��� ��밡��
		method1();
		method2();
		method3();
	}

	// �޼ҵ�
	public void method1() {
	}

	void method2() {
	}

	private void method3() {
	}
}