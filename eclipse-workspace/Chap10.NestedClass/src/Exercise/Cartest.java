package Exercise;

class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}

	// �ν��Ͻ� ���� Ŭ����
	class Tire {
		private int size;

		public Tire(int size) {
			this.size = size;
		}

		void display() {
			System.out.println("---�ڵ��� ����---");
			System.out.println("�ڵ��� �̸�: " + name);
			System.out.println("Ÿ�̾� ũ��: " + size);
			System.out.println();
		}
	}

}

public class Cartest {
	public static void main(String[] args) {

		Car c = new Car("������");
		Car.Tire ct = c.new Tire(80); // �ܺ� Ŭ����.���� Ŭ���� (��ü) = �ܺΰ�ü.new �ܺ�Ŭ����
		ct.display(); // ����� �޼ҵ�(���� Ŭ����) ȣ��

		Car c1 = new Car("���");
		Car.Tire ct1 = c1.new Tire(30);
		ct1.display();

		Car c2 = new Car("�ƹݶ�");
		Car.Tire ct2 = c2.new Tire(40);
		ct2.display();
	}

}
