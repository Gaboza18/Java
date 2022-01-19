package sec05_final_method;

public class Car {
	int speed;

	public void speedUp() { // 속도를 1씩 증가
		speed += 1;
	}

	public final void stop() { // 자손에서 override 할수없음
		System.out.println("차를 멈춥니다.");
		speed = 0;
	}
}
