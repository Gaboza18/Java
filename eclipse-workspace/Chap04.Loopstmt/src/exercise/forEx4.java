package exercise;

public class forEx4 {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == j) {
					System.out.print("     "); // i=j���� ������ 5ĭ ����
				} else {
					System.out.printf("[%d,%d]", i, j);
				}
			}
			System.out.println(); // ���� ��µǸ� ������ ������.
		}
	}
}