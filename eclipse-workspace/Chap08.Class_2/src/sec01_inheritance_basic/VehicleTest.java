package sec01_inheritance_basic;

class Vehicle {
	String color;
	int speed;
	int size;

	void attributes() { // ����ϴ� �޼ҵ�
		System.out.println("Color: " + color);
		System.out.println("Color: " + speed);
		System.out.println("Color: " + size);
	}
}

class Car extends Vehicle { // Car = �ڽ� Ŭ���� Vehicle = ���� Ŭ����
	int CC;
	int gears;

	void attributeCar() {

		System.out.println("�ڵ��� Color: " + color); // ����
		System.out.println("�ڵ��� Speed: " + speed); // ����
		System.out.println("�ڵ��� size: " + size); // ����
		System.out.println("�ڵ��� CC: " + CC); // �ڼ�
		System.out.println("�ڵ��� gears: " + gears); // �ڼ�

	}
}

public class VehicleTest {

	public static void main(String[] args) {

		Car c1 = new Car();
		
		c1.color = "Blue";
		c1.speed = 200;
		c1.size = 20; 
		c1.attributes(); // ���� Ŭ���� ���� ���

		c1.CC = 2000;
		c1.gears = 5;
		c1.attributeCar(); // ����+�ڼ� Ŭ���� ���� ���

	}

}
