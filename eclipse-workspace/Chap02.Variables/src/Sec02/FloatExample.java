package Sec02;

public class FloatExample {

	public static void main(String[] args) {

		double d1 = 3.14;
		float f1 = 3.14f; // double���� �� ������� �ʰ� float���� ���ͳ� �ڿ� f ǥ��
		double d2 = 0.1234567890123456789; // ������ ���� ǥ��, ������ double ���̻��
		float f2 = 0.1234567890123456789f; // �� ������ ���� ǥ��
		int var1 = 3000000;
		double var2 = 3e6; // 3x10^6 , ����: 3 ����: 10^6 ǥ������
		double var3 = 3e-3; // 3x10^-3 ����: 3 ����: 10^-3

		System.out.println("double d1 = " + d1);
		System.out.println("float f1 = " + f1);
		System.out.println("double d2 = " + d2);
		System.out.println("float f2 = " + f2);
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var2 = " + var3);
	}

}