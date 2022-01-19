package Exercise;

public class Rectangle {

	private float length = 2.0f;
	float width = 1.0f;

	// 기본 생성자
	public Rectangle() {
	}

	public Rectangle(float length, float width) { // 객체를 입력받는 메소드
		this.length = length;
		this.width = width;
	}

	// 메소드
	float getLength() { // 새로운 변의 길이를 반환
		return length;
	}

	void setLength(float length) { // 새로운 길이를 저장한다.(입력값을 주어야 한다)
		this.length = length;
	}

	float getWidth() { // 새로운 세로를 반환
		return width;
	}

	void setWidth(float width) { // 새로운 높이를 저장한다.(입력값을 주어야 한다)
		this.width = width;
	}

	double getArea() { // 새로운 넓이를 반환
		return (double) length * width; // 가로 세로가 float형이기 때문
	}

	double getPerimeter() { // 둘레 구하는 메소드
		return 2.0 * length + 2.0 * width;
	}

	public String toString() {
		return "Rectangle[가로= " + length + ", 세로= " + width + "]";
	}
}
