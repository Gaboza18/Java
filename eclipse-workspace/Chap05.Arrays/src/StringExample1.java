
public class StringExample1 {

	public static void main(String[] args) {

		String str1 = new String("Java Program");
		String str2 = new String("Java Programs");

		// charAt() : ���ڿ����� ������ ��ġ�� ���ڰ��� ������ ���

		str1.charAt(5); // str ������ 5��° ���� ã�´�
		System.out.println("str1�� 0�� �ε��� ��: " + str1.charAt(0));
		System.out.println("str1�� 1�� �ε��� ��: " + str1.charAt(1));
		System.out.println("str1�� 2�� �ε��� ��: " + str1.charAt(2));
		System.out.println("str1�� 3�� �ε��� ��: " + str1.charAt(3));
		System.out.println("str1�� 4�� �ε��� ��: " + str1.charAt(4));
		System.out.println("str1�� 5�� �ε��� ��: " + str1.charAt(5));
		System.out.println("str1�� 6�� �ε��� ��: " + str1.charAt(6));
		System.out.println("str1�� 7�� �ε��� ��: " + str1.charAt(7));
		System.out.println("str1�� 8�� �ε��� ��: " + str1.charAt(8));
		System.out.println("str1�� 9�� �ε��� ��: " + str1.charAt(9));
		System.out.println("str1�� 10�� �ε��� ��: " + str1.charAt(10));
		System.out.println("str1�� 11�� �ε��� ��: " + str1.charAt(11));

		// length() : ���ڿ��� ����
		System.out.println("");
		System.out.println("str1�� ����: " + str1.length());
		// �κ� ���ڿ�
		System.out.println("");
		String substr = str1.substring(0); // �κй��ڿ��� ���� �ε��� ���� ����, n�����ĺ��� ��½���
		System.out.println("substr= " + substr);

		String substr2 = str1.substring(0, 9); // �� �ε����� ���ڴ� ���� ����. (n1, n2) n1���ĺ��� ����� n2���� ��¾���
		System.out.println("substr2= " + substr2);

		// equals(): ���ڿ��� '�ּҰ�', '����'�� ������ ��
		System.out.println("");
		if (str1 == str2) {
			System.out.println("���ڿ��� '�ּҰ�'�� �����ϴ�.");
		} else {
			System.out.println("���ڿ��� '�ּҰ�'�� ���� �ʽ��ϴ�.");
		}

		if (str1.equals(str2)) {
			System.out.println("���ڿ��� '����'�� �����ϴ�.");
		} else {
			System.out.println("���ڿ��� '����'�� �ٸ��ϴ�.");
		}

	}
}
