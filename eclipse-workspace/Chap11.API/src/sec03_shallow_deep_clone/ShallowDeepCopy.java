package sec03_shallow_deep_clone;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
}

class Circle implements Cloneable {
	Point p;
	double r;

	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle shallowCopy() { // 얕은 복사
		Object obj = null;

		try {
			obj = super.clone(); // 현재 객체를 복제하여 리턴

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Circle) obj;
	}

	public Circle deepCopy() { // 깊은 복사(새로운 객체를 만들어서 복사한다 / 하나를 변경해도 나머지 값은 변경되지 않는다)
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		Circle c = (Circle) obj;
		c.p = new Point(this.p.x, this.p.y); // 새로운 객체를 생성해서 x,y 좌표값을 복사해 준다.

		return c;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

}

public class ShallowDeepCopy {
	public static void main(String[] args) {

		Circle c1 = new Circle(new Point(10, 20), 50);

		// shallow copy 수행
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();

		System.out.println("c1= " + c1);
		System.out.println("c2= " + c2);
		System.out.println("c3= " + c3);

		// c1 원점의 좌표 변경
		c1.p.x = 25;
		c1.p.y = 35;
		System.out.println("--변경후의 내용--");
		System.out.println("c1= " + c1);
		System.out.println("c2= " + c2);
		System.out.println("c3= " + c3);

	}

}
