package sec10_method_overloading;

public class Rectangle {

	// ���簢���� ����
	double getArea(double width) { // Ÿ��,����,���� �� �ϳ��� �ٸ��� �����ε� �����Ѵ�
		return width * width;
	}
	// ���簢���� ����	
	double getArea(double width, double length) {
		return width * length;
	}
}
