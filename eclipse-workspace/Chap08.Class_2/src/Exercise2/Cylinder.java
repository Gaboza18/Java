package Exercise2;

public class Cylinder extends Circle { // ���� Ŭ����: Circle �ڼ� Ŭ����: Cylinder
	private double height = 1.0;

	public Cylinder() {
		super(); // �θ������ ȣ��, ��������

	}

	public Cylinder(double height) {
		super(); // �θ������ ȣ��, ��������
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		super(); // �θ������ ȣ��, ��������
		setRadius(radius); // radius�� private���� ���ֱ� ������ setRadius
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return getArea() * height; // ������� ���� ���ϴ� ����, �θ�Ŭ������ �ִ� ���� ���� �����´�
	}

}