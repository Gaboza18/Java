package Exercise;

public class Rectangle {

	private float length = 2.0f;
	float width = 1.0f;

	// �⺻ ������
	public Rectangle() {
	}

	public Rectangle(float length, float width) { // ��ü�� �Է¹޴� �޼ҵ�
		this.length = length;
		this.width = width;
	}

	// �޼ҵ�
	float getLength() { // ���ο� ���� ���̸� ��ȯ
		return length;
	}

	void setLength(float length) { // ���ο� ���̸� �����Ѵ�.(�Է°��� �־�� �Ѵ�)
		this.length = length;
	}

	float getWidth() { // ���ο� ���θ� ��ȯ
		return width;
	}

	void setWidth(float width) { // ���ο� ���̸� �����Ѵ�.(�Է°��� �־�� �Ѵ�)
		this.width = width;
	}

	double getArea() { // ���ο� ���̸� ��ȯ
		return (double) length * width; // ���� ���ΰ� float���̱� ����
	}

	double getPerimeter() { // �ѷ� ���ϴ� �޼ҵ�
		return 2.0 * length + 2.0 * width;
	}

	public String toString() {
		return "Rectangle[����= " + length + ", ����= " + width + "]";
	}
}
