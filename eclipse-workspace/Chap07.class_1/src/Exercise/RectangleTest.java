package Exercise;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(); // 기본생성자를 바탕으로 객체 생성

		System.out.println(rectangle.toString());
		System.out.println("rectangle의 넓이: " + rectangle.getArea() + "cm^2");
		System.out.println("rectangle의 둘레: " + rectangle.getPerimeter() + "cm");
		System.out.println("rectangle의 가로: " + rectangle.getLength() + "cm");
		System.out.println("");
		
		rectangle.setLength(3.0f);
		System.out.println("rectangle 세로: "+rectangle.getLength());
		System.out.println("");

		Rectangle rectangle2 = new Rectangle(3.0f,5.0f); // 기본생성자를 바탕으로 객체 생성
		System.out.println("rectangle 세로: "+rectangle2.toString());
		System.out.println("rectangle 면적: "+rectangle2.getArea());
		System.out.println("rectangle 둘레: "+rectangle2.getPerimeter());
		System.out.println("");
		
	}

}
