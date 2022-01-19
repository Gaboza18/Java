package sec06_protected.package1;

public class B {
	public void method() {
		
		A a = new A(); // 같은 패키지 내에서 protected 생성자 사용가능
		
		a.field = "abc"; // 같은 패키지 내에서 protected 생성자 사용가능
		a.method(); // 같은 패키지 내에서 protected 생성자 사용가능
	}
}
