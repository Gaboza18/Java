package Exercise;

public class Circle {

	private double radius = 2.0; // ���� ������
	private String color = "blue"; // ���� ����

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// ���������� ��� �˾Ƴ��� �޼ҵ�
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
