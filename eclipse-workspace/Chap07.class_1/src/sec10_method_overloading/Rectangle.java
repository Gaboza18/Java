package sec10_method_overloading;

public class Rectangle {

	// 정사각형의 넓이
	double getArea(double width) { // 타입,개수,순서 중 하나만 다르면 오버로딩 성립한다
		return width * width;
	}
	// 직사각형의 넓이	
	double getArea(double width, double length) {
		return width * length;
	}
}
