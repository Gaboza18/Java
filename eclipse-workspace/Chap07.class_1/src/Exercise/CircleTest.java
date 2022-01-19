package Exercise;

public class CircleTest {

	public static void main(String[] args) {
		Circle circleTest = new Circle();

		System.out.println("circleTest의 반지름: " + circleTest.getRadius()); // 반지름값 출력
		System.out.println("circleTest의 반지름: " + circleTest.getRadius()); // 반지름값 출력(메소드))
		System.out.println("circleTest의 색깔: " + circleTest.getColor()); // 색깔 출력
		System.out.println("circleTest의 면적: " + circleTest.getArea()); // 넓이 출력(메소드)
		System.out.println(" ");

		// 매개변수가 하나 있는 생성자를 이용하여 객체 생성
		Circle circleTest2 = new Circle(4.0); // 반지름 값을 주어진 경우

		System.out.println("circleTest2의 반지름: " + circleTest2.getRadius()); // 반지름값 출력(메소드))
		System.out.println("circleTest2의 색깔: " + circleTest2.getColor()); // 색깔 출력
		System.out.println("circleTest2의 면적: " + circleTest2.getArea()); // 넓이 출력(메소드)
		System.out.println(" ");

		Circle circleTest3 = new Circle(2.0, "blue"); // 반지름 값을 주어진 경우

		System.out.println("circleTest3의 반지름: " + circleTest3.getRadius()); // 반지름값 출력(메소드))
		System.out.println("circleTest3의 색깔: " + circleTest3.getColor()); // 색깔 출력
		System.out.println("circleTest3의 면적: " + circleTest3.getArea()); // 넓이 출력(메소드)
		System.out.println(" ");

	}

}