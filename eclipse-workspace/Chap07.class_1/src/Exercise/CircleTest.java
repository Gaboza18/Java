package Exercise;

public class CircleTest {

	public static void main(String[] args) {
		Circle circleTest = new Circle();

		System.out.println("circleTest�� ������: " + circleTest.getRadius()); // �������� ���
		System.out.println("circleTest�� ������: " + circleTest.getRadius()); // �������� ���(�޼ҵ�))
		System.out.println("circleTest�� ����: " + circleTest.getColor()); // ���� ���
		System.out.println("circleTest�� ����: " + circleTest.getArea()); // ���� ���(�޼ҵ�)
		System.out.println(" ");

		// �Ű������� �ϳ� �ִ� �����ڸ� �̿��Ͽ� ��ü ����
		Circle circleTest2 = new Circle(4.0); // ������ ���� �־��� ���

		System.out.println("circleTest2�� ������: " + circleTest2.getRadius()); // �������� ���(�޼ҵ�))
		System.out.println("circleTest2�� ����: " + circleTest2.getColor()); // ���� ���
		System.out.println("circleTest2�� ����: " + circleTest2.getArea()); // ���� ���(�޼ҵ�)
		System.out.println(" ");

		Circle circleTest3 = new Circle(2.0, "blue"); // ������ ���� �־��� ���

		System.out.println("circleTest3�� ������: " + circleTest3.getRadius()); // �������� ���(�޼ҵ�))
		System.out.println("circleTest3�� ����: " + circleTest3.getColor()); // ���� ���
		System.out.println("circleTest3�� ����: " + circleTest3.getArea()); // ���� ���(�޼ҵ�)
		System.out.println(" ");

	}

}