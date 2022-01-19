package Exercise;

interface Drawable { // 인터페이스

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
	public String[] color_name = { "", "빨강", "초록", "파랑", "검정", "흰색" };
	// 숫자로 선언된 색깔을 문자로 출력하는 배열, 빈공간("") 생성한 이유는 배열은 0부터 시작하나 현재 값은 1번부터 시작

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
		System.out.printf("(%d, %d) 위치에 반지름 %.2f, 원의 색깔이 '%s'인 원을 그립니다.\n"
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
		System.out.printf("왼쪽 위 좌표(%d, %d), 오른쪽 아래좌표(%d, %d)\n", x1, y1, x2, y2);
		System.out.printf("사각형 색깔 '%s'인 사각형을 그립니다.\n", color_name[color]);
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
