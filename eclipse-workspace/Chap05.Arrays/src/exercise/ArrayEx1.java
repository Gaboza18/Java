package exercise;

public class ArrayEx1 { // ���� 10�� ���ڸ� �迭�� �����Ͽ� ����ϴ� ����

	public static void main(String[] args) {

		int[] arrayNumber = new int[10];
		int max = 0; // �ִ� ����
		int min = 0;

		System.out.print("�迭: ");
		for (int i = 0; i < arrayNumber.length; i++) {
			arrayNumber[i] = (int) (Math.random() * 100) + 1;

			if (max < arrayNumber[i]) {
				max = arrayNumber[i];
			} else if (min > arrayNumber[i]) { // �ּڰ� �ȳ��� �ذ� �ʿ�
				min = arrayNumber[i];
			}
			System.out.print(arrayNumber[i] + " ");
		}
		System.out.println("\n�迭 �ִ밪: " + max);
		System.out.println("�迭 �ִ밪: " + min);
	}
}
