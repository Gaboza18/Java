package Exercise;

interface Moveable {

	public void moveUP(); // y������ - ����

	public void moveDown(); // y������ + ����

	public void moveLeft(); // x������ - ����

	public void moveRight(); // x������ + ����

}

class MoveablePoint implements Moveable {

	int x; // �⺻�� x��
	int y; // �⺻�� y��
	int xSpeed; // x������ �þ�� ��
	int ySpeed; // y������ �þ�� ��

	public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUP() { // y���� �����Ѵ�
		System.out.println(toString());
		y -= ySpeed; // y���� ���ҽ�Ų��
		System.out.printf("�̵���ġ: (%d, %d)\n", x, y); // ���� (x,y) ���� ������ ���
	}

	@Override
	public void moveDown() { // y���� �����Ѵ�
		System.out.println(toString());
		y += ySpeed;
		System.out.printf("�̵���ġ: (%d, %d)\n", x, y);
	}

	@Override
	public void moveLeft() { // x�� ����
		System.out.println(toString());
		x -= xSpeed;
		System.out.printf("�̵���ġ: (%d, %d)\n", x, y);
	}

	@Override
	public void moveRight() { // x�� ����
		System.out.println(toString());
		x += xSpeed;
		System.out.printf("�̵���ġ: (%d, %d)\n", x, y);
	}

	public String toString() {
		return "������ġ=(" + x + "," + y + ") xSpeed= " + xSpeed + " ySpeed=" + ySpeed;
	}
}

class MoveableCircle implements Moveable {

	private int radius;
	private MoveablePoint center;

	public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {

		center = new MoveablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	public String toString() {
		return "������ ������ġ=(" + center.x + "," + center.y + ") xSpeed= " + center.xSpeed + " ySpeed=" + center.ySpeed;
	}

	@Override
	public void moveUP() {
		System.out.println(toString());
		center.y -= center.ySpeed;
		System.out.printf("�̵���ġ: (%d, %d)\n", center.x, center.y);
	}

	@Override
	public void moveDown() {
		System.out.println(toString());
		center.y += center.ySpeed;
		System.out.printf("�̵���ġ: (%d, %d)\n", center.x, center.y);

	}

	@Override
	public void moveLeft() {
		System.out.println(toString());
		center.x -= center.xSpeed;
		System.out.printf("�̵���ġ: (%d, %d)\n", center.x, center.y);

	}

	@Override
	public void moveRight() {
		System.out.println(toString());
		center.x += center.xSpeed;
		System.out.printf("�̵���ġ: (%d, %d)\n", center.x, center.y);

	}

}

public class MoveableTest {
	public static void main(String[] args) {

		Moveable p1 = new MoveablePoint(10, 25, 3, 3);

		p1.moveRight(); // ������ �̵��� ����
		p1.moveUP(); // ���� �ö󰥽� ����
		System.out.println("");

		Moveable c1 = new MoveableCircle(10, 10, 5, 5, 100);

		c1.moveDown(); // �Ʒ��� �������� ����
		c1.moveLeft(); // �������� �̵��� ����

	}
}
