package sec06_protected.package2;

import sec06_protected.package1.A;

public class D extends A { // 자손 클래스는 protected 멤버 사용가능
	
	public D() {
		
		super();
		this.field = "abc";
		this.method();
		
	}
}
