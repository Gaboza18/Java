package sec11_instance_member_Practice;

class Car_Practice {

	String model;
	int speed;

	Car_Practice(String model) {
		this.model = model;
	}

	// 메소드 생성

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 0; i <= 5; i++) { // 달리는 속도 for문
			setSpeed(i); // 1~20km 될때까지 증가하는 메소드
			System.out.println(this.model + "가 현재 '"+ this.speed + "'km로 달리는 중입니다...");
			System.out.println("");
		}
	}

}

public class CarTest_Practice {
	public static void main(String[] args) {

		Car_Practice myCar = new Car_Practice("아우디");
		Car_Practice myCar2 = new Car_Practice("포르쉐");

		myCar.run();
		myCar2.run();
	}
}
