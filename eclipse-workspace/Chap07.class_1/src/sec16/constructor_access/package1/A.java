package sec16.constructor_access.package1;

public class A {
	// ��� ����
	A a1 = new A(true); // ���� Ŭ���� ������ public ������ ���
	A a2 = new A(1); // ���� Ŭ���� ������ default ������ ���
	A a3 = new A("Hello"); // ���� Ŭ���� ������ private ������ ���

	// ������
	public A(boolean b) {
	}

	A(int b) {
	} // default �������� ������

	private A(String s) {
	} // private �������� ������
}