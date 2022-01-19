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

	void attributes() { // 출력하는 메소드
		System.out.println("Color: " + color);
		System.out.println("Color: " + speed);
		System.out.println("Color: " + size);
	}
}

class Car extends Vehicle { // Car = 자식 클래스 Vehicle = 조상 클래스
	int CC;
	int gears;

	void attributeCar() {

		System.out.println("자동차 Color: " + color); // 조상
		System.out.println("자동차 Speed: " + getSpeed()); // 조상,private 이기 떄문에 get,set 메소드 사용하여 가져온다
		System.out.println("자동차 size: " + getSize()); // 조상
		System.out.println("자동차 CC: " + CC); // 자손
		System.out.println("자동차 gears: " + gears); // 자손

	}
}

public class VehicleTest2 {

	public static void main(String[] args) {

		Car c1 = new Car();

		c1.color = "Blue";
		c1.setSpeed(200);
		c1.setSize(20);
		c1.attributes(); // 조상 클래스 내용 출력

		c1.CC = 2000;
		c1.gears = 5;
		c1.attributeCar(); // 조상+자손 클래스 내용 출력
	}

}
