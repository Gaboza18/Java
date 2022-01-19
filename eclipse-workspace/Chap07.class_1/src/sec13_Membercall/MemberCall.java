package sec13_Membercall;

public class MemberCall {
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // static(클래스 변수) 변수

	static void staticMethod() { // static 메소드, 객체를 생성하지 않고 사용가능
		System.out.println(cv);
		// System.out.println(iv); // 인스턴스 변수는 사용 불가 -> 객체 생성후 사용

		MemberCall mc = new MemberCall();
		System.out.println(mc.iv);
	}

	void instanceMethod() { // 인스턴스 메소드
		System.out.println(cv); // static 변수 사용가능
		System.out.println(iv); // 인스턴스 변스 사용가능

	}

	static void staticMethod2() {
		staticMethod();
		// instanceMethod(); // staticMethod2() 호출 시에는 없으므로 호출 불가능
	}

	void instanceMethod2() {
		staticMethod();
		instanceMethod();

	}

	public static void main(String[] args) {
		MemberCall.staticMethod(); // 객체 생성하지 않아도 생성
		MemberCall.staticMethod2();
	}
}
