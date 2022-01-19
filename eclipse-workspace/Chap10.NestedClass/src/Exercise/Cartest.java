package Exercise;

class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}

	// 인스턴스 내부 클래스
	class Tire {
		private int size;

		public Tire(int size) {
			this.size = size;
		}

		void display() {
			System.out.println("---자동차 정보---");
			System.out.println("자동차 이름: " + name);
			System.out.println("타이어 크기: " + size);
			System.out.println();
		}
	}

}

public class Cartest {
	public static void main(String[] args) {

		Car c = new Car("포르쉐");
		Car.Tire ct = c.new Tire(80); // 외부 클래스.내부 클래스 (객체) = 외부객체.new 외부클래스
		ct.display(); // 출력할 메소드(내부 클래스) 호출

		Car c1 = new Car("모닝");
		Car.Tire ct1 = c1.new Tire(30);
		ct1.display();

		Car c2 = new Car("아반떼");
		Car.Tire ct2 = c2.new Tire(40);
		ct2.display();
	}

}
