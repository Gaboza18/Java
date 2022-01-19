package sec11_static_instance_method_Practice;

class MyMath {
	long a, b;

	static long add(long x, long y) { // 더하는 static 메소드
		return x + y;
	}

	static long substract(long x, long y) { // 뺄셈하는 static 메소드
		return x - y;
	}

	long add() { // 더하는 인스턴스 메소드 
		return a + b;
	}

	long substract() { // 뺄셈하는 인스턴스 메소드
		return a - b;
	}
}

public class MyMathTest_Practice {

	public static void main(String[] args) {
		System.out.println("(static)덧셈결과: " + MyMath.add(1000L, 2000L));
		System.out.println("(static)덧셈결과: " + MyMath.substract(2000L, 1000L));
		System.out.println("");
		
		MyMath mymath = new MyMath();

		mymath.a = 755L;
		mymath.b = 655L;
		
		System.out.println("(인스턴스)덧셈결과: " + mymath.add());
		System.out.println("(인스턴스)뺄셈결과: " + mymath.substract());
	}

}
