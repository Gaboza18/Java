package Exercise;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(); // �⺻�����ڸ� �������� ��ü ����

		System.out.println(rectangle.toString());
		System.out.println("rectangle�� ����: " + rectangle.getArea() + "cm^2");
		System.out.println("rectangle�� �ѷ�: " + rectangle.getPerimeter() + "cm");
		System.out.println("rectangle�� ����: " + rectangle.getLength() + "cm");
		System.out.println("");
		
		rectangle.setLength(3.0f);
		System.out.println("rectangle ����: "+rectangle.getLength());
		System.out.println("");

		Rectangle rectangle2 = new Rectangle(3.0f,5.0f); // �⺻�����ڸ� �������� ��ü ����
		System.out.println("rectangle ����: "+rectangle2.toString());
		System.out.println("rectangle ����: "+rectangle2.getArea());
		System.out.println("rectangle �ѷ�: "+rectangle2.getPerimeter());
		System.out.println("");
		
	}

}
