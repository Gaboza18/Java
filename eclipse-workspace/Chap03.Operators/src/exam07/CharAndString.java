package exam07;

public class CharAndString {

	public static void main(String[] args) {
		char ch = 'A'; // �ùٸ� ���(' ' ���� �ϳ��� �����̵Ǿ�� �Ѵ�.)
		// char ch2 = 'AB'; // �߸��� ���(' ' ���� �ΰ��̻��� ���ԵȰ��)
		// ch = ' '; // char�� �������� �� ���ڸ� ������ ����.
		System.out.println("�����ϳ��� ǥ��: " + ch);

		String s1 = "AB"; // ���� 2�� �̻��� ���ڿ� �̶���. " " ����)
		System.out.println("���� 2���̻� ǥ��: " + s1);

		s1 = " "; // String�� �������� �� ���ڸ� ������ �ִ�.
		System.out.println("���� ǥ��: " + s1);

		/*
		 * ���ڿ�+����
		 */

		String str1 = "JDK" + 11;
		System.out.println("���ڿ�+����: " + str1);

		String str2 = "Java" + 7 + 7;
		System.out.println("���ڿ�+����+����: " + str2);

		String str3 = 3 + 3 + "JDK";
		System.out.println("����+����+���ڿ�: " + str3);

		String str4 = 3.0 + 3 + "JDK"; // 3.0 = double��, 3.0f = float��
		System.out.println("����(double)+����+���ڿ�: " + str4);

	}

}