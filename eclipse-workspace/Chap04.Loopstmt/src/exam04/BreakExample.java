package exam04;

public class BreakExample { // break��

	public static void main(String[] args) {

		int number = 0;
		int sum = 0;

		while (true) { // ������ true�̹Ƿ� ���� �ݺ���
			if (sum > 100)
				break; // �հ谡 100���� ũ�� while���� ���� ������.
			number++;
			sum += number;
		}
		System.out.printf("number=%d, sum=%d\n", number, sum); // number = 14 �϶� sum = 105�̹Ƿ� while�� Ż��
	}
}