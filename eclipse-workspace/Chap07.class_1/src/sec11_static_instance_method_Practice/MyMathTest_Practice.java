package sec11_static_instance_method_Practice;

class MyMath {
	long a, b;

	static long add(long x, long y) { // ���ϴ� static �޼ҵ�
		return x + y;
	}

	static long substract(long x, long y) { // �����ϴ� static �޼ҵ�
		return x - y;
	}

	long add() { // ���ϴ� �ν��Ͻ� �޼ҵ� 
		return a + b;
	}

	long substract() { // �����ϴ� �ν��Ͻ� �޼ҵ�
		return a - b;
	}
}

public class MyMathTest_Practice {

	public static void main(String[] args) {
		System.out.println("(static)�������: " + MyMath.add(1000L, 2000L));
		System.out.println("(static)�������: " + MyMath.substract(2000L, 1000L));
		System.out.println("");
		
		MyMath mymath = new MyMath();

		mymath.a = 755L;
		mymath.b = 655L;
		
		System.out.println("(�ν��Ͻ�)�������: " + mymath.add());
		System.out.println("(�ν��Ͻ�)�������: " + mymath.substract());
	}

}
