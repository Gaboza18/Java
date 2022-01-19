package sec01_inheritance_basic;

class Vehicle {
	String color;
	int speed;
	int size;

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
		System.out.println("자동차 Speed: " + speed); // 조상
		System.out.println("자동차 size: " + size); // 조상
		System.out.println("자동차 CC: " + CC); // 자손
		System.out.println("자동차 gears: " + gears); // 자손

	}
}

public class VehicleTest {

	public static void main(String[] args) {

		Car c1 = new Car();
		
		c1.color = "Blue";
		c1.speed = 200;
		c1.size = 20; 
		c1.attributes(); // 조상 클래스 내용 출력

		c1.CC = 2000;
		c1.gears = 5;
		c1.attributeCar(); // 조상+자손 클래스 내용 출력

	}

}
