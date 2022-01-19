package sec09_method_call;

public class Car {
	String model;
	int speed;

	// 생성자
	Car(String model) {
		this.model = model;
	}

	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}

	// 자동차가 달리는 기능의 메소드
	void run() {
		for (int i = 0; i <= 50; i += 10) {
			setSpeed(i); // 내부 메소드 호출
			System.out.printf(this.model + "가 시속 " + speed+"km로 달립니다.\n");
		}
	}
}
