package exercise;

public class forEx2 { // 3,6,9 ����

	public static void main(String[] args) {

		for (int i = 1; i <= 110; i++) {
			if (i % 15 == 0) { // 3�� 5�ǹ�� �ϰ��: 3�� 5�ǹ���� �ϳ��� �����ϸ� ù��° ������ �����ϱ� ������ ������ �����Ҽ� �ְ��Ѵ�.(��������>��������)
				System.out.print("¦¦¦,");
			} else if (i % 3 == 0) {
				System.out.print("¦,");
			} else if (i % 5 == 0) {
				System.out.print("¦¦,");
			} else {
				System.out.print(i+",");
			}
			if (i % 10 == 0) { // i���� 10�� �̻��̸� ���� �ٲ۴�.
				System.out.println();
			}
		}

	}

}