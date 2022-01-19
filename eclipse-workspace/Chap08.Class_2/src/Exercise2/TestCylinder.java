package Exercise2;

public class TestCylinder {

	public static void main(String[] args) {

		Cylinder CT = new Cylinder(); // 기본값

		System.out.println("원기둥 밑 원의 반지름: " + CT.getRadius());
		System.out.println("원기둥 높이: " + CT.getHeight());
		System.out.println("원기둥 밑 원의 넓이: " + CT.getArea());
		System.out.println("원기둥 부피: " + CT.getVolume());
		System.out.println();

		Cylinder CT2 = new Cylinder(10.0); // 반지름 기본값, 높이 임의값 설정, 색깔 기본값
		System.out.println("원기둥 밑 원의 반지름: " + CT2.getRadius());
		System.out.println("원기둥 높이: " + CT2.getHeight());
		System.out.println("원기둥 밑 원의 넓이: " + CT2.getArea());
		System.out.println("원기둥 부피: " + CT2.getVolume());
		System.out.println("원기둥 색깔: " + CT2.getColor());
		System.out.println();
		
		Cylinder CT3 = new Cylinder(2.0, 10.0);
		System.out.println("원기둥 밑 원의 반지름: " + CT3.getRadius());
		System.out.println("원기둥 높이: " + CT3.getHeight());
		System.out.println("원기둥 밑 원의 넓이: " + CT3.getArea());
		System.out.println("원기둥 부피: " + CT3.getVolume());
		System.out.println("원기둥 색깔: " + CT3.getColor());

	}

}
