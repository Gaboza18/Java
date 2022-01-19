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

	public Circle shallowCopy() { // ���� ����
		Object obj = null;

		try {
			obj = super.clone(); // ���� ��ü�� �����Ͽ� ����

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Circle) obj;
	}

	public Circle deepCopy() { // ���� ����(���ο� ��ü�� ���� �����Ѵ� / �ϳ��� �����ص� ������ ���� ������� �ʴ´�)
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		Circle c = (Circle) obj;
		c.p = new Point(this.p.x, this.p.y); // ���ο� ��ü�� �����ؼ� x,y ��ǥ���� ������ �ش�.

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

		// shallow copy ����
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();

		System.out.println("c1= " + c1);
		System.out.println("c2= " + c2);
		System.out.println("c3= " + c3);

		// c1 ������ ��ǥ ����
		c1.p.x = 25;
		c1.p.y = 35;
		System.out.println("--�������� ����--");
		System.out.println("c1= " + c1);
		System.out.println("c2= " + c2);
		System.out.println("c3= " + c3);

	}

}
