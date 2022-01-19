package sec05_constructor_overloading;

class Car {
	// ��� �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	// ������
	Car() {

	}

	Car(String model) {
		this.model = model;
	}

	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println("");

		Car car2 = new Car("�ҳ�Ÿ");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.company: " + car2.model);
		System.out.println("");

		Car car3 = new Car("�׷���", "����");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.company: " + car3.model);
		System.out.println("car3.company: " + car3.color);
		System.out.println("");

		Car car4 = new Car("�׷���", "����", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.company: " + car4.model);
		System.out.println("car4.company: " + car4.color);
		System.out.println("car4.company: " + car4.maxSpeed);

	}

}
