
public class TimesTotal {

	public static void main(String[] args) {

		int sum = 0;

		System.out.printf("3�Ǵ� 5�ǹ����: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;

				System.out.printf(i + ",");
			}
		}
		System.out.println("\n3�Ǵ� 5�ǹ���� ����: " + sum);
	}

}
