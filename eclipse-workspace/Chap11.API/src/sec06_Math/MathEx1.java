package sec06_Math;

public class MathEx1 {
	public static void main(String[] args) {

		double val = 90.7552;
		double val2 = -10.1;

		System.out.printf("round(%10.4f)=%d\n", val, Math.round(val));
		System.out.printf("ceil(%8.4f)=%f\n", val, Math.ceil(val)); // �־��� ���� �ø��Ͽ� ��ȯ�Ѵ�
		System.out.printf("ceil(%8.4f)=%f\n", val2, Math.ceil(val2));

		System.out.printf("floor(%8.4f)=%f\n", val, Math.floor(val));
		System.out.printf("floor(%8.4f)=%f\n", val2, Math.floor(val2));

		System.out.printf("rint(%8.4f)=%f\n", 5.55, Math.rint(5.55)); // ���� ����� �������� double������ ��ȯ
		System.out.printf("rint(%8.4f)=%f\n", 5.11, Math.rint(5.11));
	}
}
