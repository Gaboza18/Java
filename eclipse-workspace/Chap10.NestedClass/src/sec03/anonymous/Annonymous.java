package sec03.anonymous;

// Person�� ��ӹ޾� �̸��� �����ϴ� Ŭ������ ���� 
class Student extends Person {

	@Override
	void wakeup() {
		System.out.println("�л��� 6�ÿ� �Ͼ�ϴ�.");
	}

}

public class Annonymous {
	Person s = new Student();

	// �ʵ��� �ʱⰪ���� �͸��� Ŭ���� ����
	Person field1 = new Person() {
		int wakeup_time;

		void work() {
			System.out.println("����մϴ�.");
		}

		@Override
		void wakeup() {
			super.wakeup();
		}

	};

	void method1() {
		field1.wakeup();

		// ���ú����� �͸��� Ŭ���� ����
		Person lv = new Person() {
			void walk() {
				System.out.println("��å�� �մϴ�.");
			}

			void wakeup() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
			}
		}; // �͸� Ŭ���� �� ;
		lv.wakeup();
	}
}
