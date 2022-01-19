package GetterSetter_Practice;

public class CarExample {
	public static void main(String[] args) {

		Car myCar = new Car();

		System.out.println("현재속도: "+myCar.getSpeed());
		
		myCar.setSpeed(-50); // 잘못된 속도값 입력
		System.out.println("현재속도: " + myCar.getSpeed()); 
		
		myCar.setSpeed(60);
		System.out.println("현재속도: " + myCar.getSpeed());
		
	}
}
