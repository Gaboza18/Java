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
			// point 객체를 복사하여 리턴받는다
			obj = super.clone(); // Object 클래스의 clone() 호출

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

}

public class CloneEx1 {

	public static void main(String[] args) {
		
		Point original = new Point(10, 20);
		Point copy = (Point) original.clone(); // Original 객체를 복제함

		System.out.println(original);
		System.out.println(copy);

		if (original.equals(copy)) {
			System.out.println("original과 copy는 같습니다.");
		} else {
			System.out.println("original과 copy는 다릅니다.");
		}
	}
}
