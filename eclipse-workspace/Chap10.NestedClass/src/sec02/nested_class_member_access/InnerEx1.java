package sec02.nested_class_member_access;

/*
 *  �ν��Ͻ� �޼ҵ�, static �޼ҵ忡�� �ν��Ͻ� ���� Ŭ���� Ÿ�� , static ����Ŭ���� Ÿ���� ��� ���ɿ��� Ȯ��
 */
public class InnerEx1 {

	class InstanceInner { // �ν��Ͻ� ����Ŭ����
	}

	static class StaticInner { // static ����Ŭ����
	}

	// �ν��Ͻ� ������ �ν��Ͻ� Ŭ���� ��ü�� ������ �����Ѱ�? / ����
	InstanceInner iv = new InstanceInner();

	// static ������ static Ŭ���� ��ü�� ������ �����Ѱ�? / ����
	static StaticInner cv = new StaticInner();

	// static �޼ҵ忡���� �ν��Ͻ� ����� ���� �Ұ�
	static void staticMethod() {
		// static �޼ҵ忡���� �ν��Ͻ� ����� ����Ҽ� ����
		// InstanceInner obj1 = new InstanceInner();
		// static �޼ҵ忡�� �ν��Ͻ� ����� ����Ϸ��� -> �ܺ� Ŭ���� ��ü ������ ���.
		InnerEx1 outer = new InnerEx1(); // 1��
		InstanceInner obj3 = outer.new InstanceInner(); // 2��

		StaticInner obj2 = new StaticInner();
	}

	void instanceMethod() { // �ν��Ͻ� �޼ҵ忡���� �ν��Ͻ� ����� static ��� ��� ��밡��
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();

		// �޼ҵ� ������ ����� ����Ŭ���� �ܺο��� ���ٺҰ�
		// LocalInner localIn = new LocalInner();
	}

	void myMethod() {
		class LocalInner {
		}

		LocalInner localIn = new LocalInner();
	}
}
