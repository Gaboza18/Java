package sec02_clone;

class Point implements Cloneable {

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

	@Override
	protected Object clone() {
		Object obj = null;

		try {
			// point ��ü�� �����Ͽ� ���Ϲ޴´�
			obj = super.clone(); // Object Ŭ������ clone() ȣ��

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

}

public class CloneEx1 {

	public static void main(String[] args) {
		
		Point original = new Point(10, 20);
		Point copy = (Point) original.clone(); // Original ��ü�� ������

		System.out.println(original);
		System.out.println(copy);

		if (original.equals(copy)) {
			System.out.println("original�� copy�� �����ϴ�.");
		} else {
			System.out.println("original�� copy�� �ٸ��ϴ�.");
		}
	}
}
