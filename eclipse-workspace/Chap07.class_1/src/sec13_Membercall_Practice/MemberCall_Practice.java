package sec13_Membercall_Practice;

public class MemberCall_Practice {

	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // static ����

	static void staticMethod() { // �ν��Ͻ� ����, static ���� ��� ���
		System.out.println(cv);

		MemberCall_Practice mcp = new MemberCall_Practice();
		System.out.println(mcp.iv);
	}

	void instanceMethod() { // �ν��Ͻ� �޼ҵ�
		System.out.println(iv); // �ν��Ͻ� ���� ��밡��
		System.out.println(cv); // static ���� ��밡��

	}

	static void staticMethod2() {
		staticMethod();
		// instanceMethod();
	}

	void instanceMethod2() {
		staticMethod();
		instanceMethod();
	}

	public static void main(String[] args) {
		MemberCall_Practice.staticMethod();
		MemberCall_Practice.staticMethod2();

	}

}
