package October_15_Friday_Homework;

public class Number2_Homework { // 1~100���� ����, ��� ���

	public static void main(String[] args) {

		int sum = 0; // ������ ����
		double average = 0; // ��հ� ����

		for (int number = 1; number <= 100; number++) { // 1~100���� ���ϴ� for��
			sum += number; // 1���� 100���� ���Ͽ� sum�� �����Ѵ�.
			average = sum / 100.0; // 1~n���� ������ n���� ������ ���(double)������ ����
		}
		System.out.println("1~100���� ��: " + sum); 
		System.out.printf("1~100���� ���: %.2f ", average); // %.2f(�Ҽ��� 2�ڸ� ���� ���)
	}
}