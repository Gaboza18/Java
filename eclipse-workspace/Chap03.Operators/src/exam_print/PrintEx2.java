package exam_print;

public class PrintEx2 {
	public static void main(String[] args) {
		float f1 = .10f; // 0.10 �ǹ�
		float f2 = 1e1f; // 1 x 10^1 = 10.0 �ǹ�
		float f3 = 3.14e3f; // 3.14 x 10^3 = 3140 �ǹ�
		double d = 1.23456789;

		System.out.printf("f1 = %f, %e\n", f1, f1); // %e = ��������
		System.out.printf("f2 = %f, %e\n", f2, f2);
		System.out.printf("f3 = %f, %e\n", f3, f3);
		System.out.printf("d = %f\n", d);
		System.out.printf("d = [%14.10f]\n", d); // 14�ڸ� ��� �Ҽ��� ���� 10�ڸ� ���, ���������� ����
		System.out.printf("d = [%-14.10f]\n", d); // 14�ڸ� ��� �Ҽ��� ���� 10�ڸ� ���, �������� ����
	}
}