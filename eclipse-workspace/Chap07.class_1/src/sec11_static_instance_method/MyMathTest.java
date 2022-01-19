package sec11_static_instance_method;

class MyMath {

	long a;
	long b;

	// static �żҵ� - ��ü�� �������� �ʰ� ��밡���� �޼ҵ�
	// �ν��Ͻ� ���� a,b�� ����Ҽ� ����.
	static long add(long x, long y) {
		return x + y;
	}

	static long substract(long x, long y) {
		return x - y;
	}

	// �ν��Ͻ� �޼ҵ� - ��ü�� �����ؾ� ��� ������ �޼ҵ�
	// �ν��Ͻ� ���� a,b�� ��� ������
	long add() {
		return a + b;
	}

}

public class MyMathTest {

	public static void main(String[] args) {
		System.out.println("�������(static): " + MyMath.add(100L, 200L)); // Ŭ����.�޼ҵ�( , ) �ٷ� ȣ�� �����ϴ�
		System.out.println("�������(static): " + MyMath.substract(300L, 200L)); // Ŭ����.�޼ҵ�( , ) �ٷ� ȣ�� �����ϴ�

		// �ν��Ͻ� method �׽�Ʈ
		MyMath mymath = new MyMath();

		mymath.a = 240L;
		mymath.b = 240L;
		System.out.println("�������(�ν��Ͻ�): " + mymath.add());
	}

}
