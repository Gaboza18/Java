package arrays;

public class ArrayEx1 {

	public static void main(String[] args) {

		int[] score = new int[5];
		int sum = 0;

		score[0] = 75;
		score[1] = 85;
		score[2] = 87;
		score[3] = 79;
		score[4] = 90;

		for (int i = 0; i < 5; i++) {
			System.out.printf("����[%d]: %d\n", i, score[i]);
			sum += score[i];
		}
		System.out.printf("����: %d \n", sum);

		double avg = (double) sum / score.length; // score.length: �迭�� ����, ���տ��� �迭�� ���̷� ������.
		System.out.println("���: " +avg);
	}
}