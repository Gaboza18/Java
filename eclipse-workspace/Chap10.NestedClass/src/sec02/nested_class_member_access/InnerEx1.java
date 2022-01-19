package sec02.nested_class_member_access;

/*
 *  인스턴스 메소드, static 메소드에서 인스턴스 내부 클래스 타입 , static 내부클래스 타입의 사용 가능여부 확인
 */
public class InnerEx1 {

	class InstanceInner { // 인스턴스 내부클래스
	}

	static class StaticInner { // static 내부클래스
	}

	// 인스턴스 변수에 인스턴스 클래스 객체의 대입이 가능한가? / 가능
	InstanceInner iv = new InstanceInner();

	// static 변수에 static 클래스 객체의 대입이 가능한가? / 가능
	static StaticInner cv = new StaticInner();

	// static 메소드에서는 인스턴스 멤버를 접근 불가
	static void staticMethod() {
		// static 메소드에서는 인스턴스 멤버를 사용할수 없다
		// InstanceInner obj1 = new InstanceInner();
		// static 메소드에서 인스턴스 멤버를 사용하려면 -> 외부 클래스 객체 생성후 사용.
		InnerEx1 outer = new InnerEx1(); // 1번
		InstanceInner obj3 = outer.new InstanceInner(); // 2번

		StaticInner obj2 = new StaticInner();
	}

	void instanceMethod() { // 인스턴스 메소드에서는 인스턴스 멤버와 static 멤버 모두 사용가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();

		// 메소드 내부의 선언된 내부클래스 외부에서 접근불가
		// LocalInner localIn = new LocalInner();
	}

	void myMethod() {
		class LocalInner {
		}

		LocalInner localIn = new LocalInner();
	}
}
