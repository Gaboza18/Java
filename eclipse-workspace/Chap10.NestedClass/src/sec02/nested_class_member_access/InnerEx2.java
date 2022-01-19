package sec02.nested_class_member_access;

/*
 *  인스턴스 멤버변수, static 멤버변수 등이 내부클래스에서 
 *  어떻게 사용되는지 확인
 */
public class InnerEx2 {
	private int outerLv = 0;
	static int outerCv = 0;

	// 인스턴스 내부 클래스 에서 외부변수(인스턴스, static)의 사용
	class InstanceInner {
		int iiv = outerLv; // private 이나 클래스 내부 클래스 이기 떄문에 사용가능
		int iiv2 = outerCv;
	}

	// static 내부 클래스에서 외부변수의 사용
	static class StaticInner {
		// int siv = outerLv; // 외부 클래스의 인스턴스 멤버에 접근불가능
		static int scv = outerCv; // static 가능
	}

	void myMethod() {
		int lv = 0;
		final int LV = 0;

		class LocalInner {
			int liv = outerLv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
	}
}