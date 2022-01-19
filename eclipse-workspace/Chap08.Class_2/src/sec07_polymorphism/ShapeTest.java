package sec07_polymorphism; // 다형성 예제

class Shape { // 도형을 표현하는 클래스
	void draw() {
		System.out.println("도형을 그립니다.");
	}
}

class Rectangle extends Shape { // 사각형

	double width = 1.0;
	double height = 1.0;

	double rectArea() {
		return width * height;
	}

	void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

class Circle extends Shape { // 원

	double radius = 1.0;

	double circleArea() { // 원의 넓이
		return radius * radius * Math.PI;
	}

	void draw() {
		System.out.println("원을 그립니다.");
	}
}

class Triangle extends Shape { // 삼각형

	double length = 1.0;
	double height = 1.0;

	double triangleArea() {
		return length * height / 2.0;
	}

	void draw() {
		System.out.println("삼각형을 그립니다.");
	}
}

public class ShapeTest {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();

		r1.draw();
		System.out.println("사각형의 면적: " + r1.rectArea());
		System.out.println();

		// polymorphism(다형성)

		Shape shape = new Rectangle(); // 조상 클래스 = 자손 클래스

		shape.draw();
		// shape.rectArea(); // 조상타입의 참조변수로는 자손 메소드 호출 불가능

		shape = new Triangle();
		shape.draw();
		// shape.triangleArea(); // 조상타입의 참조변수로는 자손 메소드 호출 불가능

		shape = new Circle();
		shape.draw();
		// shape.CircleArea(); // 조상타입의 참조변수로는 자손 메소드 호출 불가능

	}

}
