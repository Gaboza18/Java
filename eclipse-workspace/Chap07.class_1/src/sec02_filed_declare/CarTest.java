package sec02_filed_declare;

public class CarTest {

	public static void main(String[] args) {

		// 객체를 생성
		Car myCar = new Car(); // 미리 만들어 놓은 Car 클래스

		// 필드값 읽기
		System.out.println("제조회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxspeed);
		System.out.println("속도: " + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("현재속도: " + myCar.speed);
	}

}
