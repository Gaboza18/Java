package sec11_instance_member_Practice;

class Car_Practice {

	String model;
	int speed;

	Car_Practice(String model) {
		this.model = model;
	}

	// �޼ҵ� ����

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 0; i <= 5; i++) { // �޸��� �ӵ� for��
			setSpeed(i); // 1~20km �ɶ����� �����ϴ� �޼ҵ�
			System.out.println(this.model + "�� ���� '"+ this.speed + "'km�� �޸��� ���Դϴ�...");
			System.out.println("");
		}
	}

}

public class CarTest_Practice {
	public static void main(String[] args) {

		Car_Practice myCar = new Car_Practice("�ƿ��");
		Car_Practice myCar2 = new Car_Practice("������");

		myCar.run();
		myCar2.run();
	}
}
