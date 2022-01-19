package sec11_static_instance_method;

class MyMath {

	long a;
	long b;

	// static 매소드 - 객체를 생성하지 않고 사용가능한 메소드
	// 인스턴스 변수 a,b를 사용할수 없다.
	static long add(long x, long y) {
		return x + y;
	}

	static long substract(long x, long y) {
		return x - y;
	}

	// 인스턴스 메소드 - 객체를 생성해야 사용 가능한 메소드
	// 인스턴스 변수 a,b를 사용 가능함
	long add() {
		return a + b;
	}

}

public class MyMathTest {

	public static void main(String[] args) {
		System.out.println("덧셈결과(static): " + MyMath.add(100L, 200L)); // 클래스.메소드( , ) 바로 호출 가능하다
		System.out.println("뺄셈결과(static): " + MyMath.substract(300L, 200L)); // 클래스.메소드( , ) 바로 호출 가능하다

		// 인스턴스 method 테스트
		MyMath mymath = new MyMath();

		mymath.a = 240L;
		mymath.b = 240L;
		System.out.println("덧셈결과(인스턴스): " + mymath.add());
	}

}
