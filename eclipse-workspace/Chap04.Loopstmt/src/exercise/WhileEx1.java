package exercise;

public class WhileEx1 { // 10������ 3�� 5�� ��� ����

	public static void main(String[] args) {

		int number = 1;
		int sum = 0; // ���� �����ϴ� ����

		while (number <= 20) { // 1���� 10�� �ɶ����� ����
			number++;

			if (number % 3 == 0 || number % 5 == 0) { // 3�ǹ��, 5�ǹ�� ����
				sum += number; // 3�� ���, 5�ǹ�� ���� sum���� �����Ѵ�.
				System.out.printf("1~10���� 3�� 5�� ���: %d\n", number); // 3�� 5�ǹ�� �� ����
			}
		}
		System.out.println("1~10���� 3�� 5�� ����� ����: " + sum); // 3�� 5�ǹ�� ���� ���� ���
	}
}