package sec14_static_final;

public class StaticFinalTest {

	static final double PI = 3.141592; // 상수 정의

	public static void main(String[] args) {
		// 반지름: 5인 원의 면적
		System.out.println("원의 면적: " + (5.0 * 5.0 * PI));
		// PI = 3.14; // 상수 변경 불가능

	}

}
