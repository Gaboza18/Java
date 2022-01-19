package sec01_inheritance_feature;

class Vehicle {
	String color;
	private int speed;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

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
		System.out.println("�ڵ��� Speed: " + getSpeed()); // ����,private �̱� ������ get,set �޼ҵ� ����Ͽ� �����´�
		System.out.println("�ڵ��� size: " + getSize()); // ����
		System.out.println("�ڵ��� CC: " + CC); // �ڼ�
		System.out.println("�ڵ��� gears: " + gears); // �ڼ�

	}
}

public class VehicleTest2 {

	public static void main(String[] args) {

		Car c1 = new Car();

		c1.color = "Blue";
		c1.setSpeed(200);
		c1.setSize(20);
		c1.attributes(); // ���� Ŭ���� ���� ���

		c1.CC = 2000;
		c1.gears = 5;
		c1.attributeCar(); // ����+�ڼ� Ŭ���� ���� ���
	}

}
