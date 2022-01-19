package sec13_Membercall;

public class MemberCall {
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // static(Ŭ���� ����) ����

	static void staticMethod() { // static �޼ҵ�, ��ü�� �������� �ʰ� ��밡��
		System.out.println(cv);
		// System.out.println(iv); // �ν��Ͻ� ������ ��� �Ұ� -> ��ü ������ ���

		MemberCall mc = new MemberCall();
		System.out.println(mc.iv);
	}

	void instanceMethod() { // �ν��Ͻ� �޼ҵ�
		System.out.println(cv); // static ���� ��밡��
		System.out.println(iv); // �ν��Ͻ� ���� ��밡��

	}

	static void staticMethod2() {
		staticMethod();
		// instanceMethod(); // staticMethod2() ȣ�� �ÿ��� �����Ƿ� ȣ�� �Ұ���
	}

	void instanceMethod2() {
		staticMethod();
		instanceMethod();

	}

	public static void main(String[] args) {
		MemberCall.staticMethod(); // ��ü �������� �ʾƵ� ����
		MemberCall.staticMethod2();
	}
}
