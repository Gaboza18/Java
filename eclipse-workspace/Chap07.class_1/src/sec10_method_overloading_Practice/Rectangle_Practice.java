package sec10_method_overloading_Practice;

public class Rectangle_Practice {

	// 정사각형의 넓이
	double getArea(double width) {
		return width * width;
	}

	// 직사각형 넓이
	double getArea(double width1, double width2) {
		return width1 * width2;
	}

}
