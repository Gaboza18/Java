package sec06_other_constructor_call;

class Car {
	// 멤버 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car() {

	}

	Car(String model) {
		this(model, null, 0); // model만 출력 나머지는 값이 없음
	}

	Car(String model, String color) {
		this(model, color, 0); // model,color만 출력 나머지는 값이 없음
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	// 생성자를 이용한 인스턴스 복사, 자신의 객체를 입력으로 받는 생성자
	Car(Car c) {
		this.model = c.model;
		this.color = c.color;
		this.maxSpeed = c.maxSpeed;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println("");

		Car car2 = new Car("소나타");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println("car2.color: " + car2.color);
		System.out.println("car2.maxspeed: " + car2.maxSpeed);
		System.out.println("");

		Car car3 = new Car("그렌져", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.maxSpeed: " + car3.maxSpeed);
		System.out.println("");

		Car car4 = new Car("그렌져", "빨강", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		System.out.println("");

		// 기존의 객체를 이용한 인스턴스 내용 복사
		Car car5 = new Car(car4); // car4에서 갖는 값을 car5에도 저장한다 저장위치는 다르다.
		System.out.println("car5.company: " + car5.company);
		System.out.println("car5.model: " + car5.model);
		System.out.println("car5.color: " + car5.color);
		System.out.println("car5.maxSpeed: " + car5.maxSpeed);

	}

}
