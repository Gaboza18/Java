package sec01_inheritance_basic;

class Vehicle2 {
	String color;
	int speed;
	int size;

	void attributes() {
		System.out.println("����: " + color);
		System.out.println("�ӵ�: " + speed);
		System.out.println("ũ��: " + size);
		System.out.println();
	}
}

class Car2 extends Vehicle2 {
	int CC;
	int gears;

	void attributes_print() {
		System.out.println("����: " + color);
		System.out.println("�ӵ�: " + speed);
		System.out.println("ũ��: " + size);
		System.out.println("����: " + CC);
		System.out.println("���: " + gears);
	}
}

public class VehcileTest_Practice {
	public static void main(String[] args) {
		
		Car2 c2 = new Car2();

		c2.color = "red";
		c2.speed = 300;
		c2.size = 30;
		c2.attributes();

		c2.CC = 5000;
		c2.gears = 7;
		c2.attributes_print();

	}
}
