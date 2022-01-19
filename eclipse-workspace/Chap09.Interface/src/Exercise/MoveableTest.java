package Exercise;

interface Moveable {

	public void moveUP(); // y축으로 - 방향

	public void moveDown(); // y축으로 + 방향

	public void moveLeft(); // x축으로 - 방향

	public void moveRight(); // x축으로 + 방향

}

class MoveablePoint implements Moveable {

	int x; // 기본값 x값
	int y; // 기본값 y값
	int xSpeed; // x축으로 늘어나는 값
	int ySpeed; // y축으로 늘어나는 값

	public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUP() { // y값이 감소한다
		System.out.println(toString());
		y -= ySpeed; // y값을 감소시킨다
		System.out.printf("이동위치: (%d, %d)\n", x, y); // 본래 (x,y) 에서 증감한 결과
	}

	@Override
	public void moveDown() { // y값이 증가한다
		System.out.println(toString());
		y += ySpeed;
		System.out.printf("이동위치: (%d, %d)\n", x, y);
	}

	@Override
	public void moveLeft() { // x값 감소
		System.out.println(toString());
		x -= xSpeed;
		System.out.printf("이동위치: (%d, %d)\n", x, y);
	}

	@Override
	public void moveRight() { // x값 증가
		System.out.println(toString());
		x += xSpeed;
		System.out.printf("이동위치: (%d, %d)\n", x, y);
	}

	public String toString() {
		return "현재위치=(" + x + "," + y + ") xSpeed= " + xSpeed + " ySpeed=" + ySpeed;
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
		return "원점의 현재위치=(" + center.x + "," + center.y + ") xSpeed= " + center.xSpeed + " ySpeed=" + center.ySpeed;
	}

	@Override
	public void moveUP() {
		System.out.println(toString());
		center.y -= center.ySpeed;
		System.out.printf("이동위치: (%d, %d)\n", center.x, center.y);
	}

	@Override
	public void moveDown() {
		System.out.println(toString());
		center.y += center.ySpeed;
		System.out.printf("이동위치: (%d, %d)\n", center.x, center.y);

	}

	@Override
	public void moveLeft() {
		System.out.println(toString());
		center.x -= center.xSpeed;
		System.out.printf("이동위치: (%d, %d)\n", center.x, center.y);

	}

	@Override
	public void moveRight() {
		System.out.println(toString());
		center.x += center.xSpeed;
		System.out.printf("이동위치: (%d, %d)\n", center.x, center.y);

	}

}

public class MoveableTest {
	public static void main(String[] args) {

		Moveable p1 = new MoveablePoint(10, 25, 3, 3);

		p1.moveRight(); // 오른쪽 이동시 증가
		p1.moveUP(); // 위로 올라갈시 감소
		System.out.println("");

		Moveable c1 = new MoveableCircle(10, 10, 5, 5, 100);

		c1.moveDown(); // 아래로 내려갈시 증가
		c1.moveLeft(); // 왼쪽으로 이동시 감소

	}
}
