package sec10_method_overloading;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();

		// ���簢���� ����
		double result1 = r1.getArea(5.0);

		// ���簢���� ����
		double result2 = r1.getArea(5.0, 3.0);
		
		// ��� ��� 
		System.out.println("���簢�� ����: "+result1);
		System.out.println("���簢�� ����: "+result2);
	}

}
