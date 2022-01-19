package Exercise;

public class Circle {

	private double radius = 2.0; // 원의 반지름
	private String color = "blue"; // 원의 색깔

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// 반지름값을 얻어 알아내는 메소드
	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * 3.14;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

}
