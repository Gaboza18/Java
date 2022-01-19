package Exercise2;

public class Cylinder extends Circle { // 조상 클래스: Circle 자손 클래스: Cylinder
	private double height = 1.0;

	public Cylinder() {
		super(); // 부모생성자 호출, 생략가능

	}

	public Cylinder(double height) {
		super(); // 부모생성자 호출, 생략가능
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		super(); // 부모생성자 호출, 생략가능
		setRadius(radius); // radius가 private선언 되있기 때문에 setRadius
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return getArea() * height; // 원기둥의 부피 구하는 공식, 부모클래스에 있는 원의 넓이 가져온다
	}

}