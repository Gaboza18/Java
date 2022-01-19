package Exercise2;

public class Circle {

	private double radius = 1.0;
	private String color = "red";

	public Circle() {

	}

	public Circle(double radius) { // 생성자의 오버로딩(동일한 클래스의 다른 타입, 갯수, 순서)
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return radius * radius * Math.PI; // Math.PI = 3.14
	}

	public String toString() {
		return "Circle[radius= " + radius + "color= " + color + "]";
	}
}