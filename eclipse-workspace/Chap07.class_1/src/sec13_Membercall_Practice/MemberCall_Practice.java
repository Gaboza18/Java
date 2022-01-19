package sec13_Membercall_Practice;

public class MemberCall_Practice {

	int iv = 10; // 인스턴스 변수
	static int cv = 20; // static 변수

	static void staticMethod() { // 인스턴스 변수, static 변수 출력 방법
		System.out.println(cv);

		MemberCall_Practice mcp = new MemberCall_Practice();
		System.out.println(mcp.iv);
	}

	void instanceMethod() { // 인스턴스 메소드
		System.out.println(iv); // 인스턴스 변수 사용가능
		System.out.println(cv); // static 변수 사용가능

	}

	static void staticMethod2() {
		staticMethod();
		// instanceMethod();
	}

	void instanceMethod2() {
		staticMethod();
		instanceMethod();
	}

	public static void main(String[] args) {
		MemberCall_Practice.staticMethod();
		MemberCall_Practice.staticMethod2();

	}

}
