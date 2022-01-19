package sec02_parent_constuctor_call2;

class Point { // 2차원 좌표를 표현하는 클래스
	int x, y;

	Point(int x, int y) { // 생성자
		this.x = x;
		this.y = y;
	}

	String getLocation() { // 2차원 좌표값 알아내기
		return "x: " + x + "y: " + y;

	}
}

class Point3D extends Point { // 3차원 좌표를 표현하는 클래스 , 조상: Point, 자손: Point3D
	int z;

	Point3D(int x, int y, int z) { // 생성자
		super(x, y); // 컴파일에서 부모생성자 호출이 자동으로 추가됨, 부모 클래스에 기본생성자 (Point(){ })가 없어서 오류 발생
						// 1. 부모클래스의 기본생성자를 추가해 주면 해결 Point(){ }
						// 2. 부모클래스의 이미 정의된 생성자 호출
		
		//this.x = x; // 부모 생성자를 통해 x,y 값이 초기화 되기 때문에 설정 필요없음. 
		//this.y = y;
		this.z = z;
	}

	String getLocation() { // 3차원 좌표값 알아내기
		return "x: " + x + " y: " + y + " z: " + z;

	}

}

public class PoinTest {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(3, 4, 5); // 기본생성자 없음
		
		System.out.println(p1.getLocation());
	}

}
