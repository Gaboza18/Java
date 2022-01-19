package sec02.nested_class_member_access;

/*
 *  각 종류에 내부 클래스들을 다른 클래스에서 사용하는 방법
 */
class Outer {
	class InstanceInner {
		int iv = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner {
			int lv = 400;
		}
		// 로컬 내부 클래스내의 인스턴스 변수 사용
		LocalInner liv = new LocalInner();
		liv.lv = 100;
	}
}

public class InnerEx3 {

	public static void main(String[] args) {
		// 내부 인스턴스 클래스를 사용하려면 외부 클래스의 객체를 생성
		Outer oc = new Outer(); // 외부 클래스 객체 생성
		Outer.InstanceInner oi = oc.new InstanceInner();

		System.out.println("oi.iv= " + oi.iv);

		// static 내부 클래스의 static 멤버변수를 사용하려면
		System.out.println("Outer.StaticInner.cv= " + Outer.StaticInner.cv);

		// static 내부 클래스의 인스턴스 멤버변수를 사용하려면
		// static 내부 클래스의 객체를 먼저 생성한다.
		Outer.StaticInner os = new Outer.StaticInner(); // 객체 생성
		os.iv = 10;
	}

}
