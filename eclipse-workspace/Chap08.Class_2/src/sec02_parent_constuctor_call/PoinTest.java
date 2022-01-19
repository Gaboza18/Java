package sec02_parent_constuctor_call;

class Point { // 2���� ��ǥ�� ǥ���ϴ� Ŭ����

	int x, y;

	Point() { // �⺻ ������ ����, �̻����� super( , ) ȣ���ʿ�

	}

	Point(int x, int y) { // ������
		this.x = x;
		this.y = y;
	}

	String getLocation() { // ��ǥ�� �˾Ƴ���
		return "x: " + x + " y: " + y;

	}
}

class Point3D extends Point { // 3���� ��ǥ�� ǥ���ϴ� Ŭ���� , ����: Point, �ڼ�: Point3D
	int z;

	Point3D(int x, int y, int z) { // ������
		// super(x,y); // �����Ͽ��� �θ������ ȣ���� �ڵ����� �߰���, �θ� Ŭ������ �⺻������ (Point(){ })�� ��� ����
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation3D() {
		return "x: " + x + " y: " + y + " z: " + z;
	}
}

public class PoinTest {

	public static void main(String[] args) {

		Point3D p1 = new Point3D(3, 4, 5); // �⺻������ ����
		
		System.out.println(p1.getLocation()); // 2����
		System.out.println(p1.getLocation3D()); // 3����
	}

}
