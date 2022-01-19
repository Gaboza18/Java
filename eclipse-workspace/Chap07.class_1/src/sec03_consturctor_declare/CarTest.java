package sec03_consturctor_declare;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car("메르세데스", "노란색", "벤츠"); // Car(String color, String model)

		System.out.println("제조회사: " + myCar.company);
		System.out.println("모델: " + myCar.model);
		System.out.println("색상: " + myCar.color);

	}

}
