package sec06_protected.package1;

public class B {
	public void method() {
		
		A a = new A(); // ���� ��Ű�� ������ protected ������ ��밡��
		
		a.field = "abc"; // ���� ��Ű�� ������ protected ������ ��밡��
		a.method(); // ���� ��Ű�� ������ protected ������ ��밡��
	}
}
