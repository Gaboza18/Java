package exam08;

public class CompareEx { // �񱳿�����

	public static void main(String[] args) {

		int a = 12;
		int b = 24;

		boolean result = (a == b); // a�� b�� ������?

		System.out.println("a�� " + a);
		System.out.println("b�� " + b);
		System.out.println("a==b ����� " + result);
		System.out.println("");

		System.out.println("a�� " + a);
		System.out.println("b�� " + b);
		result = (a != b); // a�� b�� �ٸ���?
		System.out.println("a != b ����� " + result);
		System.out.println("");

		System.out.println("a�� " + a);
		System.out.println("b�� " + b);
		result = (a >= b);
		System.out.println("a>=b ����� " + result);
		System.out.println("");

		char c1 = 'A';
		char c2 = 'B';
		result = (c1 < c2);
		System.out.println("c1<c2 ����� " + result);
		System.out.println("");

		/*
		 * 0.1d�� 0.1f ��
		 */

		float f = 0.1f;
		double d = 0.1; // double���� ���ͳ�
		result = (f == d);
		System.out.printf("f=%19.17f\n", f); // 19ĭ ��� �Ҽ��� ���� 17�ڸ� ���
		System.out.printf("d=%19.17f\n", d); // float�� �Ҽ��� ���� 8~9�ڸ� ������ ���е� ����
		System.out.println("0.1f �� 0.1 ������?: " + result);
		System.out.println("");

		/*
		 * ���ڿ��� �ּҰ� ��
		 */

		String str1 = new String("abc");
		String str2 = new String("abc");
		result = (str1 == str2); // str1 �� str2 �� �ּҰ��� ������?
		System.out.println("str1 �� str2 ������?(str1 == str2) " + result);
		System.out.println("");
		
		/*
		 * ���ڿ��� ������ ������ ��
		 */
		
		result = (str1.equals(str2));
		System.out.println("str1 �� str2 ������?(str1.equals(str2)) " + result);
		System.out.println("");
	}

}