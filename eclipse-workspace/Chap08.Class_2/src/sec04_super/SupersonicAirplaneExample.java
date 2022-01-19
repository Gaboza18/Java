package sec04_super;

class Airplane {

	public void land() { // 착륙하는 객체
		System.out.println("착륙 합니다.");
	}

	public void fly() { // 비행하는 객체
		System.out.println("일반 비행합니다.");
	}

	public void takeOff() { // 이륙하는 객체
		System.out.println("이륙 합니다.");
	}

}

class SupersonicAirplane extends Airplane {

	public static final int Normal = 1; // 보통속도 비행
	public static final int Supersonic = 2; // 초음속 비행
	public int flyMode = Normal; // 비행모드 = 보통속도 비행 초기화

	public void fly() { // 조상 클래스 Airplane 에서 오버라이딩(public void fly())
		if (flyMode == Supersonic) { // 비행모드가 2 이면 초음속 비행
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); // 조상 객체의 Airplane fly() 메소드 호출
		}
	}

}

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.Supersonic;
		sa.fly();
		sa.flyMode = SupersonicAirplane.Normal;
		sa.fly();
		sa.land();

	}

}
