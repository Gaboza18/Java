package sec02_parent_constuctor_call;

class Point { // 2차원 좌표를 표현하는 클래스

	int x, y;

	Point() { // 기본 생성자 생성, 미생성시 super( , ) 호출필요

	}

	Point(int x, int y) { // 생성자
		this.x = x;
		this.y = y;
	}

	String getLocation() { // 좌표값 알아내기
		return "x: " + x + " y: " + y;

	}
}

class Point3D extends Point { // 3차원 좌표를 표현하는 클래스 , 조상: Point, 자손: Point3D
	int z;

	Point3D(int x, int y, int z) { // 생성자
		// super(x,y); // 컴파일에서 부모생성자 호출이 자동으로 추가됨, 부모 클래스에 기본생성자 (Point(){ })가 없어서 오류
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation3D() {
		return "x: " + x + " y: " + y + " z: " + z;
	}
}

public class PoinTest {

	public static void main(String[] args) {

		Point3D p1 = new Point3D(3, 4, 5); // 기본생성자 없음
		
		System.out.println(p1.getLocation()); // 2차원
		System.out.println(p1.getLocation3D()); // 3차원
	}

}
