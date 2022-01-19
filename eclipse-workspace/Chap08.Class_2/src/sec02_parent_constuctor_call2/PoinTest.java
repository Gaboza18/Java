package sec02_parent_constuctor_call2;

class Point { // 2���� ��ǥ�� ǥ���ϴ� Ŭ����
	int x, y;

	Point(int x, int y) { // ������
		this.x = x;
		this.y = y;
	}

	String getLocation() { // 2���� ��ǥ�� �˾Ƴ���
		return "x: " + x + "y: " + y;

	}
}

class Point3D extends Point { // 3���� ��ǥ�� ǥ���ϴ� Ŭ���� , ����: Point, �ڼ�: Point3D
	int z;

	Point3D(int x, int y, int z) { // ������
		super(x, y); // �����Ͽ��� �θ������ ȣ���� �ڵ����� �߰���, �θ� Ŭ������ �⺻������ (Point(){ })�� ��� ���� �߻�
						// 1. �θ�Ŭ������ �⺻�����ڸ� �߰��� �ָ� �ذ� Point(){ }
						// 2. �θ�Ŭ������ �̹� ���ǵ� ������ ȣ��
		
		//this.x = x; // �θ� �����ڸ� ���� x,y ���� �ʱ�ȭ �Ǳ� ������ ���� �ʿ����. 
		//this.y = y;
		this.z = z;
	}

	String getLocation() { // 3���� ��ǥ�� �˾Ƴ���
		return "x: " + x + " y: " + y + " z: " + z;

	}

}

public class PoinTest {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(3, 4, 5); // �⺻������ ����
		
		System.out.println(p1.getLocation());
	}

}
