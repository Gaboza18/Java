package Exercise2;

public class TestCylinder {

	public static void main(String[] args) {

		Cylinder CT = new Cylinder(); // �⺻��

		System.out.println("����� �� ���� ������: " + CT.getRadius());
		System.out.println("����� ����: " + CT.getHeight());
		System.out.println("����� �� ���� ����: " + CT.getArea());
		System.out.println("����� ����: " + CT.getVolume());
		System.out.println();

		Cylinder CT2 = new Cylinder(10.0); // ������ �⺻��, ���� ���ǰ� ����, ���� �⺻��
		System.out.println("����� �� ���� ������: " + CT2.getRadius());
		System.out.println("����� ����: " + CT2.getHeight());
		System.out.println("����� �� ���� ����: " + CT2.getArea());
		System.out.println("����� ����: " + CT2.getVolume());
		System.out.println("����� ����: " + CT2.getColor());
		System.out.println();
		
		Cylinder CT3 = new Cylinder(2.0, 10.0);
		System.out.println("����� �� ���� ������: " + CT3.getRadius());
		System.out.println("����� ����: " + CT3.getHeight());
		System.out.println("����� �� ���� ����: " + CT3.getArea());
		System.out.println("����� ����: " + CT3.getVolume());
		System.out.println("����� ����: " + CT3.getColor());

	}

}
