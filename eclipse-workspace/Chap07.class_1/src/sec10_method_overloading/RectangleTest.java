package sec10_method_overloading;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();

		// 정사각형의 넓이
		double result1 = r1.getArea(5.0);

		// 직사각형의 넓이
		double result2 = r1.getArea(5.0, 3.0);
		
		// 결과 출력 
		System.out.println("정사각형 넓이: "+result1);
		System.out.println("직사각형 넓이: "+result2);
	}

}
