package sec05_final_method;

public class Car {
	int speed;

	public void speedUp() { // �ӵ��� 1�� ����
		speed += 1;
	}

	public final void stop() { // �ڼտ��� override �Ҽ�����
		System.out.println("���� ����ϴ�.");
		speed = 0;
	}
}
