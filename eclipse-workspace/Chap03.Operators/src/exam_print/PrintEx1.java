package exam_print;

public class PrintEx1 {

	public static void main(String[] args) {

		byte b = 1;
		short s = 2;
		char c = 'A';
		int finger = 10;
		String str = "Java";

		System.out.printf("byte�� %d\n", b);
		System.out.printf("short�� %d\n", s);
		System.out.printf("char�� %c (%d)\n", c, (int) c); // char ���� int ������ ����ȯ �ؾ� ��°���.
		System.out.printf("����� �հ����� [%5d]�� �Դϴ�.\n", finger); // %nd = ��nĭ ����.
		System.out.printf("����� �հ����� [%-5d]�� �Դϴ�.\n", finger); // %-nd = ��nĭ ����.
		System.out.printf("����� �հ����� [%05d]�� �Դϴ�.\n", finger); // %0nd = ��nĭ 0���� ä���.
		/*
		 * ū ���� ���
		 */
		long big = 100_000_000_000L;
		System.out.printf("big�� %d\n", big);
		/*
		 * 8(0),16(0x)������ ���
		 */
		int octNum = 010; // 8���� / 10����: 8
		int hexNum = 0x10; // 16���� / 10����: 16
		System.out.printf("8���� %#o, 10���� %d\n", octNum, octNum); // 8���� ���(%#o)
		System.out.printf("16���� %#x, 10���� %d\n", hexNum, hexNum); // 16���� ���(%#x)
		/*
		 * ���ڿ� ���
		 */
		System.out.printf("���ڿ��� %s\n", str); // ���ڿ� ���(%s)
		/*
		 * ���ڿ� �ڸ��� ����
		 */
		System.out.printf("���ڿ��� [%10s]\n", str); // ���ڿ� ���(%s), 10�ڸ� ���� ���(��)
		System.out.printf("���ڿ��� [%-10s]\n", str); // ���ڿ� ���(%s), 10�ڸ� ���� ���(��)
		System.out.printf("���ڿ��� [%.3s]\n", str); // 3���ڸ� ���
		System.out.printf("�����: 80%%"); // % ���
	}

}