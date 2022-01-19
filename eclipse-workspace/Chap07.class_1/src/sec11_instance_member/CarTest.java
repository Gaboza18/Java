package sec11_instance_member;

class Car {
	
	String model;
	int speed;

	Car(String model) {
		this.model = model;
	}

	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i < 50; i += 10) {
			setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km)");
		}
	}
}

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car("람보르기니");
		Car myCar2 = new Car("아우디");

		myCar.run();
		myCar2.run();

	}

}
