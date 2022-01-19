package sec11_instance_member;

class Car {
	
	String model;
	int speed;

	Car(String model) {
		this.model = model;
	}

	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i < 50; i += 10) {
			setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�: " + this.speed + "km)");
		}
	}
}

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car("���������");
		Car myCar2 = new Car("�ƿ��");

		myCar.run();
		myCar2.run();

	}

}
