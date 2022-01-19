package sec10_method_overloading_Practice;

public class RectangleTest_Practice {

	public static void main(String[] args) {

		Rectangle_Practice r2 = new Rectangle_Practice();

		// 정사각형 넓이
		double result1 = r2.getArea(5.3);
		// 직사각형 넓이
		double result2 = r2.getArea(4.0, 2.0);

		System.out.println("정사각형 넓이: " + result1);
		System.out.println("직사각형 넓이(오버로딩): " + result2);
	}

}
