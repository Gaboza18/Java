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
		System.out.println("차량 색깔: " + color);
		System.out.println("차량 속도: " + speed);
		System.out.println("차량 크기: " + size);
	}
}

class Car2 extends Vehicle2 {
	int CC;
	int gears;

	void attributes_Print() {
		
		System.out.println("차량 색깔: " + color);
		System.out.println("차량 속도: " + getSpeed()); // private 선언 되었기 떄문에 getSpeed() 객체로 출력한다.
		System.out.println("차량 크기: " + getSize());
		System.out.println("차량 연료: " + CC);
		System.out.println("차량 기어: " + gears);
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
