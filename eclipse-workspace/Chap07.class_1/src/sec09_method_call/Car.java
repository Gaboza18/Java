package sec09_method_call;

public class Car {
	String model;
	int speed;

	// ������
	Car(String model) {
		this.model = model;
	}

	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}

	// �ڵ����� �޸��� ����� �޼ҵ�
	void run() {
		for (int i = 0; i <= 50; i += 10) {
			setSpeed(i); // ���� �޼ҵ� ȣ��
			System.out.printf(this.model + "�� �ü� " + speed+"km�� �޸��ϴ�.\n");
		}
	}
}
