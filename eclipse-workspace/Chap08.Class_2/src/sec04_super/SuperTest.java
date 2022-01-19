package sec04_super;

class Parent { // 조상 클래스
	int x = 10;
}

class child extends Parent { // 자손 클래스
	int x = 20; // child 클래스에도 부모와 같은 x 변수 선언

	void method() {
		System.out.println("x= " + x); // 자손 변수 출력
		System.out.println("this.x= " + this.x); // 자손 변수 출력
		System.out.println("super.x= " + super.x); // 조상 변수 출력
	}
}

public class SuperTest {

	public static void main(String[] args) {
		child child = new child();

		child.method();
	}

}
