package exam05;

public class ArithmeticOp { // ���������
	public static void main(String[] args) {

		int value1 = 14;
		int value2 = 5;
		int result = 0;

		result = value1 + value2;
		System.out.println("����: " + result);
		result = value1 - value2;
		System.out.println("����: " + result);
		result = value1 * value2;
		System.out.println("����: " + result);
		result = value1 / value2; // ���� ������ ���� = ����
		System.out.println("������(��): " + result);
		result = value1 % value2; // ������ ������, N�ǹ���� ã���� ���̻��
		System.out.println("������(������): " + result);

		double result2 = (double) value1 / value2; // value1 Ÿ���� double�� �ٲ�� value2�� �ڵ����� ��ȯ�ȴ�.
		System.out.println("������(�Ǽ�): " + result2);

		/*
		 * int ���� ���� Ÿ���� �������
		 */

		short s = 100;
		byte b = 50;

		result = s + b; // short�� byte�� �Ի����� intŸ������ �ڵ���ȯ
		short s2 = (short) (s + b); // ������� short�� �����ϰ� ������ short�� Ÿ�Ժ�ȯ ���ش�.
		System.out.println("����(int ��ȯ): " + result);
		System.out.println("����(short ��ȯ): " + s2);

		/*
		 * char Ÿ���� �������
		 */

		char c1 = 'A' + 1; // A= 65
		System.out.println("c1= " + c1);

		char c2 = 'A';
		// char c3 = c2 + 1; // c2�� int Ÿ������ ��ȯ�Ŀ� ������� �����ϹǷ� char�� ������ ���� �Ұ����ϴ�.
		int result3 = c2 + 1; // char�� A=65�� Int ������ ����Ѵ�.(���ڿ� -> ���ڿ��� ��ȯ)
		System.out.println("c2= " + result3);

		c2 = ++c1; // char Ÿ���� ������ ���������� ���� ����ȯ�� �Ͼ�� ����.
		System.out.println("c2= " + c2);

		/*
		 * ���� ���ͳ��� ��� ����
		 */

		int i = 'B' - 'A'; // B = 66, A = 65 // * ASCII �ڵ�����
		System.out.println("i: " + i);

		i = '2' - '0'; // '2' = 82 '0' = 80 // * ASCII �ڵ�����
		System.out.println("'2'-'0': " + i);

		/*
		 * ������ �������� ��ȣ
		 */

		System.out.println("10 % 8 = " + (10 % 8)); // (+) % (+) = (+)
		System.out.println("10 % -8 = " + (10 % -8)); // (+) % (-) = (+)
		System.out.println("-10 % 8 = " + (-10 % 8)); // (-) % (+) = (-)
		System.out.println("-10 % -8 = " + (-10 % -8)); // (-) % (-) = (-)
	}
}
