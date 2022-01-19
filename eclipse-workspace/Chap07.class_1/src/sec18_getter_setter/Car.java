package sec18_getter_setter;

public class Car {
	// 멤버 변수(필드)
	int speed1; // 외부에서 사용가능(같은 패키지 내 사용가능)
	private int speed2; // private: 같은 클래스 내에서만 사용가능
	private boolean stop;

	// 메소드
	int getSpeed() { // 멤버변수의 값을 알려주는 역할
		return speed2;
	}

	void setSpeed(int speed2) { // 멤버변수의 값을 저장하는 역할

		if (speed2 < 0) { // 조건문을 활용하여 값을 조정할수 있다
			this.speed2 = 0;
		} else
			this.speed2 = speed2;
	}

	boolean isStop() { // boolean 일 경우 get 대신 is메소드명
		return stop;
	}

	void setStop(boolean stop) {
		this.stop = stop;
		this.speed2 = 0;
	}
}
