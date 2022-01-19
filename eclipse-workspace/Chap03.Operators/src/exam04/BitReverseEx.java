package exam04;

public class BitReverseEx { // ��Ʈ��ȯ����
	public static void main(String[] args) {
		int value1 = 10; // value = 10
		int value2 = ~value1; // value���� ����
		int value3 = value2 + 1;// value���� �������� 1�� ����

		System.out.println("value1= " + value1 + "(2����: " + toBinary(value1) + ")"); // value�� �ʱⰪ
		System.out.println("value2= " + value2 + "(2����: " + toBinary(value2) + ")"); // value�� ����
		System.out.println("value3= " + value3 + "(2����: " + toBinary(value3) + ")"); // value�� ������(����)
	}

	/*
	 * �Է��� ������ 2������ ��ȯ�ϴ� �޼ҵ�
	 */

	public static String toBinary(int value) {
		String str = Integer.toBinaryString(value); // value ������ �������� ���ڿ��� ��ȯ

		while (str.length() < 32) { // string ���� 32�ڸ��� ���������� while��
			str = "0" + str; // 32�ڸ��� �ɶ����� 0�� ������Ų��.
		}
		return str;
	}
}