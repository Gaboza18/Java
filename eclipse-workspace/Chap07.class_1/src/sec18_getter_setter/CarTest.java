package sec18_getter_setter;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.speed1 = -10; // 자동차의 속도는 음수가 될수 없다(잘못된 값 설정)
		// car1.speed2 = 10; // private로 설정했기 때문 타 클래스 사용불가
		
		car1.setSpeed(-10);
		System.out.println("car1의 속도: "+car1.getSpeed());
		
		car1.setSpeed(50);
		System.out.println("car1의 속도: "+car1.getSpeed());
		
		car1.setStop(true);
		System.out.println("car1이 정지상태 입니까?: "+car1.isStop());
		System.out.println("car1의 속도: "+car1.getSpeed());
	}

}
