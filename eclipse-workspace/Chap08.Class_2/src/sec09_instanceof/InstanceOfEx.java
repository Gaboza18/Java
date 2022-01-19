package sec09_instanceof;

class Parent {

}

class Child extends Parent {

}

public class InstanceOfEx {

	// instanceof �̻��
	public static void method1(Parent parent) {
		Child child = (Child) parent; // DownCasting
		System.out.println("method1: Child Ÿ������ ��ȯ ����.");
	}

	// instanceof ���
	public static void method2(Parent parent) {
		// Parent��� ���������� Child Ÿ������ ��ȯ�������� �Ǵ�
		if (parent instanceof Child) {
			Child child = (Child) parent; // DownCasting
			System.out.println("method2: Child Ÿ������ ��ȯ ����.");
		} else {
			System.out.println("method2: Child Ÿ������ ��ȯ�Ҽ� ����.");
		}

	}

	public static void main(String[] args) {

		Parent parentA = new Child(); // Upcasting
		System.out.println("Child Ÿ���� ��ü�� �θ� ���������� ����");
		method2(parentA);
		method1(parentA);
		System.out.println();

		System.out.println("����Ÿ���� ��ü�� ����Ÿ�� ���������� ����");
		Parent parentB = new Parent(); // ���� Ÿ���� ��ü�� ����Ÿ�� �������� ���
		method2(parentB);
		method1(parentB); //����
	}

}
