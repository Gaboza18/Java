package sec02.nested_class_member_access;

/*
 *  �� ������ ���� Ŭ�������� �ٸ� Ŭ�������� ����ϴ� ���
 */
class Outer {
	class InstanceInner {
		int iv = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner {
			int lv = 400;
		}
		// ���� ���� Ŭ�������� �ν��Ͻ� ���� ���
		LocalInner liv = new LocalInner();
		liv.lv = 100;
	}
}

public class InnerEx3 {

	public static void main(String[] args) {
		// ���� �ν��Ͻ� Ŭ������ ����Ϸ��� �ܺ� Ŭ������ ��ü�� ����
		Outer oc = new Outer(); // �ܺ� Ŭ���� ��ü ����
		Outer.InstanceInner oi = oc.new InstanceInner();

		System.out.println("oi.iv= " + oi.iv);

		// static ���� Ŭ������ static ��������� ����Ϸ���
		System.out.println("Outer.StaticInner.cv= " + Outer.StaticInner.cv);

		// static ���� Ŭ������ �ν��Ͻ� ��������� ����Ϸ���
		// static ���� Ŭ������ ��ü�� ���� �����Ѵ�.
		Outer.StaticInner os = new Outer.StaticInner(); // ��ü ����
		os.iv = 10;
	}

}
