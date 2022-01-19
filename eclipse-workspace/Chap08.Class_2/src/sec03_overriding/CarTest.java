package sec03_overriding; // 오버라이딩 조건: 메소드 이름, 매개변수, 리턴타입 같아야 한다.

class Car { // 조상 클래스
	public void speedLimit() {
		System.out.println("최대 속도는 200km/h 입니다.");
	}
}

class Sonata extends Car { // 자손 클래스
	public void speedLimit() {
		System.out.println("소나타의 최대속도 240km/h 입니다.");
	}
}

public class CarTest {

	public static void main(String[] args) { // 조상과 자손 메소드 같을때 오버라이딩(자기 자신의 메소드 사용)
		Sonata car1 = new Sonata();

		car1.speedLimit();
	}

}
