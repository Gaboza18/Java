package exam09;

public class LogicalOp {
	public static void main(String[] args) {
		int x = 100; // x���� ���ڸ� �Է�
		boolean result, result2;

		result = (x >= 10 && x <= 20);
		System.out.println("x���� 10�� ���ų� ũ�� 20���� �۰ų� �����ϱ�? " + result);
		System.out.println("");

		result = (x % 2 == 0);
		System.out.println("x���� 2�ǹ�� �Դϱ�? " + result);
		System.out.println("");

		result = (x % 2 == 0 || x % 3 == 0);
		System.out.println("x���� 2�ǹ�� �Ǵ� 3�ǹ�� �Դϱ�? " + result);
		System.out.println("");

		/*
		 * ch�� ���� ��,�ҹ������� �Ǵ�
		 */

		char ch = 'F'; // ch���� '���ĺ�'�� �Է�
		result = (ch >= 'a' && ch < 'z');
		System.out.println("ch���� �ҹ��� �Դϱ�? " + result);
		System.out.println("");

		result2 = (ch >= 'A' && ch < 'Z');
		System.out.println("ch���� �빮�� �Դϱ�? " + result2);
		System.out.println("");
	}
}
