package Exercise;

interface Drawable { // �������̽�

	public static int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	int BLACK = 4;
	int WHITE = 5;

	public void draw(int color);
}

class Circle implements Drawable {

	private int x;
	private int y;
	private double radius;
	public String[] color_name = { "", "����", "�ʷ�", "�Ķ�", "����", "���" };
	// ���ڷ� ����� ������ ���ڷ� ����ϴ� �迭, �����("") ������ ������ �迭�� 0���� �����ϳ� ���� ���� 1������ ����

	public Circle(int x, int y, double radius) {

		this.x = x;
		this.y = y;
		this.radius = radius;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public void draw(int color) {
		// color_name[color]
		System.out.printf("(%d, %d) ��ġ�� ������ %.2f, ���� ������ '%s'�� ���� �׸��ϴ�.\n"
				, x, y, radius, color_name[color]);
		System.out.println();
	}
}

class Rectangle implements Drawable {

	private int x1, y1, x2, y2;
	public String[] color_name = { "", "RED", "GREEN", "BLUE", "BLACK", "WHITE" };

	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	@Override
	public void draw(int color) {
		System.out.printf("���� �� ��ǥ(%d, %d), ������ �Ʒ���ǥ(%d, %d)\n", x1, y1, x2, y2);
		System.out.printf("�簢�� ���� '%s'�� �簢���� �׸��ϴ�.\n", color_name[color]);
	}

}

public class DrawableTest {

	public static void main(String[] args) {

		Drawable c1 = new Circle(20, 30, 100);
		c1.draw(2); // 1~5

		Drawable r1 = new Rectangle(100, 100, 200, 200);
		r1.draw(3);
	}

}
