package sec03_overriding; // �������̵� ����: �޼ҵ� �̸�, �Ű�����, ����Ÿ�� ���ƾ� �Ѵ�.

class Car { // ���� Ŭ����
	public void speedLimit() {
		System.out.println("�ִ� �ӵ��� 200km/h �Դϴ�.");
	}
}

class Sonata extends Car { // �ڼ� Ŭ����
	public void speedLimit() {
		System.out.println("�ҳ�Ÿ�� �ִ�ӵ� 240km/h �Դϴ�.");
	}
}

public class CarTest {

	public static void main(String[] args) { // ����� �ڼ� �޼ҵ� ������ �������̵�(�ڱ� �ڽ��� �޼ҵ� ���)
		Sonata car1 = new Sonata();

		car1.speedLimit();
	}

}
