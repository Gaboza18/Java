package sec04_super;

class Parent { // ���� Ŭ����
	int x = 10;
}

class child extends Parent { // �ڼ� Ŭ����
	int x = 20; // child Ŭ�������� �θ�� ���� x ���� ����

	void method() {
		System.out.println("x= " + x); // �ڼ� ���� ���
		System.out.println("this.x= " + this.x); // �ڼ� ���� ���
		System.out.println("super.x= " + super.x); // ���� ���� ���
	}
}

public class SuperTest {

	public static void main(String[] args) {
		child child = new child();

		child.method();
	}

}
