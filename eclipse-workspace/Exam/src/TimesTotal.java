
public class TimesTotal {

	public static void main(String[] args) {

		int sum = 0;

		System.out.printf("3또는 5의배수는: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;

				System.out.printf(i + ",");
			}
		}
		System.out.println("\n3또는 5의배수의 합은: " + sum);
	}

}
