package sec02_exception_syntax;

public class ExceptionHandling {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int) (Math.random() * 10); // 0<Math.random<10.xxxxx
				System.out.println(result);
			} catch (ArithmeticException e) { // �������ڰ� 0�� ������ ���� ����� �������� ����
				System.out.println("0���� ������ �����ϴ�.");
			}

		}
	}
}
