package sec10_method_overloading_Practice;

public class RectangleTest_Practice {

	public static void main(String[] args) {

		Rectangle_Practice r2 = new Rectangle_Practice();

		// ���簢�� ����
		double result1 = r2.getArea(5.3);
		// ���簢�� ����
		double result2 = r2.getArea(4.0, 2.0);

		System.out.println("���簢�� ����: " + result1);
		System.out.println("���簢�� ����(�����ε�): " + result2);
	}

}
