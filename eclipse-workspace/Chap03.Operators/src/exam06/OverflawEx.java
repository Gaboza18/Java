package exam06;
/*
 * �� ���� ��� ����� ������ Ÿ�Ժ��� ũ�Ⱑ ū ���
 */
public class OverflawEx {

	public static void main(String[] args) {
		int a = 10_000_000; // = 100,000,000
		int b = 20_000_000;

		int c = (a * b);
		System.out.println("a*b�� �����(int��): " + c); // �߸��� ��°�

		long d = (long) a * b;
		System.out.println("a*b�� �����(long��): " + d); // �ùٸ� ��°�
	}

}