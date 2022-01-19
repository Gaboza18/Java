package sec01_inheritance_feature;

class Vehicle2 {
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

	void attributes_Print() {
		System.out.println("���� ����: " + color);
		System.out.println("���� �ӵ�: " + speed);
		System.out.println("���� ũ��: " + size);
	}
}

class Car2 extends Vehicle2 {
	int CC;
	int gears;

	void attributes_Print() {
		
		System.out.println("���� ����: " + color);
		System.out.println("���� �ӵ�: " + getSpeed()); // private ���� �Ǿ��� ������ getSpeed() ��ü�� ����Ѵ�.
		System.out.println("���� ũ��: " + getSize());
		System.out.println("���� ����: " + CC);
		System.out.println("���� ���: " + gears);
		System.out.println();
	}
}

public class VehicleTest2_Practice {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		
		c1.color = "black";
		c1.setSpeed(5000);
		c1.setSize(60);
		c1.attributes_Print();
		
		c1.CC= 2000;
		c1.gears=5;
		c1.attributes_Print();
	}

}
