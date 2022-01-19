package sec04_super;

class Airplane {

	public void land() { // �����ϴ� ��ü
		System.out.println("���� �մϴ�.");
	}

	public void fly() { // �����ϴ� ��ü
		System.out.println("�Ϲ� �����մϴ�.");
	}

	public void takeOff() { // �̷��ϴ� ��ü
		System.out.println("�̷� �մϴ�.");
	}

}

class SupersonicAirplane extends Airplane {

	public static final int Normal = 1; // ����ӵ� ����
	public static final int Supersonic = 2; // ������ ����
	public int flyMode = Normal; // ������ = ����ӵ� ���� �ʱ�ȭ

	public void fly() { // ���� Ŭ���� Airplane ���� �������̵�(public void fly())
		if (flyMode == Supersonic) { // �����尡 2 �̸� ������ ����
			System.out.println("������ �����մϴ�.");
		} else {
			super.fly(); // ���� ��ü�� Airplane fly() �޼ҵ� ȣ��
		}
	}

}

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.Supersonic;
		sa.fly();
		sa.flyMode = SupersonicAirplane.Normal;
		sa.fly();
		sa.land();

	}

}
