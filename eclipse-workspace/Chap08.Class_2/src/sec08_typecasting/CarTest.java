package sec08_typecasting;

class Car { // 조상
	String color;

	void drive() {
		System.out.println("자동차가 달립니다.");
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}

class FireEngine extends Car { // 자손
	void water() {
		System.out.println("물을 뿌립니다.");
	}
}

class Ambulance extends Car { // 자손
	void siren() {
		System.out.println("싸이렌을 울립니다.");
	}
}

public class CarTest {
	public static void main(String[] args) {

		// 조상 타입의 참조변수 선언
		Car car = null;

		// 자손 타입의 참조변수 선언
		FireEngine fe = new FireEngine();

		fe.water(); // 같은 객체 안의 메소드 호출

		car = fe; // 자손객체 -> 조상의 참조변수에 대입(UPCasting), 명시적으로 형변환 필요없음 car = (car)fe;(x)

		// car.water(); // 자손의 메소드를 사용할수 없음
		FireEngine fe2 = (FireEngine) car; // 조상타입 -> 자손타입 대입(DownCasting), 명시적으로 형변환 필요
		fe2.water();
	}

}
