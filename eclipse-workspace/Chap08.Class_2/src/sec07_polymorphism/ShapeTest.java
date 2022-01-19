package sec07_polymorphism; // ������ ����

class Shape { // ������ ǥ���ϴ� Ŭ����
	void draw() {
		System.out.println("������ �׸��ϴ�.");
	}
}

class Rectangle extends Shape { // �簢��

	double width = 1.0;
	double height = 1.0;

	double rectArea() {
		return width * height;
	}

	void draw() {
		System.out.println("�簢���� �׸��ϴ�.");
	}
}

class Circle extends Shape { // ��

	double radius = 1.0;

	double circleArea() { // ���� ����
		return radius * radius * Math.PI;
	}

	void draw() {
		System.out.println("���� �׸��ϴ�.");
	}
}

class Triangle extends Shape { // �ﰢ��

	double length = 1.0;
	double height = 1.0;

	double triangleArea() {
		return length * height / 2.0;
	}

	void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
	}
}

public class ShapeTest {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();

		r1.draw();
		System.out.println("�簢���� ����: " + r1.rectArea());
		System.out.println();

		// polymorphism(������)

		Shape shape = new Rectangle(); // ���� Ŭ���� = �ڼ� Ŭ����

		shape.draw();
		// shape.rectArea(); // ����Ÿ���� ���������δ� �ڼ� �޼ҵ� ȣ�� �Ұ���

		shape = new Triangle();
		shape.draw();
		// shape.triangleArea(); // ����Ÿ���� ���������δ� �ڼ� �޼ҵ� ȣ�� �Ұ���

		shape = new Circle();
		shape.draw();
		// shape.CircleArea(); // ����Ÿ���� ���������δ� �ڼ� �޼ҵ� ȣ�� �Ұ���

	}

}
