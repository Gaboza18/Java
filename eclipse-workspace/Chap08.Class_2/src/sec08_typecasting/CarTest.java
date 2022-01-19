package sec08_typecasting;

class Car { // ����
	String color;

	void drive() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	}

	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}

class FireEngine extends Car { // �ڼ�
	void water() {
		System.out.println("���� �Ѹ��ϴ�.");
	}
}

class Ambulance extends Car { // �ڼ�
	void siren() {
		System.out.println("���̷��� �︳�ϴ�.");
	}
}

public class CarTest {
	public static void main(String[] args) {

		// ���� Ÿ���� �������� ����
		Car car = null;

		// �ڼ� Ÿ���� �������� ����
		FireEngine fe = new FireEngine();

		fe.water(); // ���� ��ü ���� �޼ҵ� ȣ��

		car = fe; // �ڼհ�ü -> ������ ���������� ����(UPCasting), ��������� ����ȯ �ʿ���� car = (car)fe;(x)

		// car.water(); // �ڼ��� �޼ҵ带 ����Ҽ� ����
		FireEngine fe2 = (FireEngine) car; // ����Ÿ�� -> �ڼ�Ÿ�� ����(DownCasting), ��������� ����ȯ �ʿ�
		fe2.water();
	}

}
