package exercise;

public class LottoNumber {

	public static void main(String[] args) {
		
		// 45���� ������ ������ �迭���� ����
		int[] lottoNumber = new int[45];

		// lotto �迭 �ʱ�ȭ
		System.out.print("�ʱ� ������: ");
		for (int number = 0; number < lottoNumber.length; number++) { // �迭 �ε����� 0~44
			lottoNumber[number] = number + 1; // 1������ ����
			System.out.printf("%d ", lottoNumber[number]); // 1���� 45���� ����Ѵ�.
		}
		System.out.println("");
		
		int index = 0; // �迭�� ���� �� ��ġ ����
		int temp = 0; // ù��° ���� �ӽ÷� ������ ����

		for (int k = 0; k < 100; k++) { // �迭�� ������ ���ڿ� ù��° ����� ���ڸ� ���� �ٲ��ش�.
			index = (int) (Math.random() * 45); // 0~45������ ���� ���� �������� �����´�.
			temp = lottoNumber[0]; // ù��° ����� ���� �ӽ� ����ҿ� ����
			lottoNumber[0] = lottoNumber[index]; // ������ ��ġ�� ���� ù��° ��ҿ� ����
			lottoNumber[index] = temp; // ù��° ����� ���� ������ ��ġ�� ����
		}

		// ���� ���� ������ ���
		System.out.print("���� ���� ������: ");
		for (int item : lottoNumber) { // ���� for��
			System.out.printf("%d ", item);
		}
		System.out.println();
		System.out.println();
		System.out.printf("�̹��� �ζǹ�ȣ �Դϴ�.\n");
		// �迭���� ó�� 6���� ���ڸ� ���
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lottoNumber[i]);
		}

	}

}
