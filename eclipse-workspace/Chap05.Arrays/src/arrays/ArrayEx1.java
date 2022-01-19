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
			System.out.printf("점수[%d]: %d\n", i, score[i]);
			sum += score[i];
		}
		System.out.printf("총합: %d \n", sum);

		double avg = (double) sum / score.length; // score.length: 배열의 길이, 총합에서 배열의 길이로 나눈다.
		System.out.println("평균: " +avg);
	}
}