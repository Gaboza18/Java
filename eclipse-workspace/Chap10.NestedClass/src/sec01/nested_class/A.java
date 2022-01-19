package sec01.nested_class;

//Outer Class(�ܺ� Ŭ����)
public class A {
	public A() {
		System.out.println("A ��ü�� ������");
	}

	// �ν��Ͻ� �ɹ� Ŭ����
	public class B {
		B() {
			System.out.println("B ��ü�� ������");
		}

		int field1;
		// static int field2; -> static ���� �ν��Ͻ� ����� ���Ұ�

		void method1() {

		}

		// static void method2() {}
	}

	static class C {
		C() {
			System.out.println("C ��ü�� ������");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}
	}

	void method() {
		// ���� Ŭ����
		class D {
			D() {
				System.out.println("D ��ü�� ������");
			}

			int field1;

			void method1() {
			}
			// static int field2;
			// static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();

	}
}
