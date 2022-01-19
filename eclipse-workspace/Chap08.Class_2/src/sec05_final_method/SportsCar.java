package sec05_final_method;

public class SportsCar extends Car {

	public void speedUp() { // 오버라이드 메소드
		speed += 10;
	}

	//public void stop() { // 조상 메소드 에서 final로 선언해서 오버라이드 불가
		//System.out.println("스포츠카를 멈춘다.");
		//speed = 0;
	//}
}
