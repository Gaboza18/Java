package sec09_instanceof;

class Parent {

}

class Child extends Parent {

}

public class InstanceOfEx {

	// instanceof 미사용
	public static void method1(Parent parent) {
		Child child = (Child) parent; // DownCasting
		System.out.println("method1: Child 타입으로 변환 성공.");
	}

	// instanceof 사용
	public static void method2(Parent parent) {
		// Parent라는 참조변수가 Child 타입으로 변환가능한지 판단
		if (parent instanceof Child) {
			Child child = (Child) parent; // DownCasting
			System.out.println("method2: Child 타입으로 변환 성공.");
		} else {
			System.out.println("method2: Child 타입으로 변환할수 없음.");
		}

	}

	public static void main(String[] args) {

		Parent parentA = new Child(); // Upcasting
		System.out.println("Child 타입의 객체를 부모 참조변수에 대입");
		method2(parentA);
		method1(parentA);
		System.out.println();

		System.out.println("조상타입의 객체에 조상타입 참조변수에 대입");
		Parent parentB = new Parent(); // 조상 타입의 객체에 조상타입 참조변수 사용
		method2(parentB);
		method1(parentB); //예외
	}

}
