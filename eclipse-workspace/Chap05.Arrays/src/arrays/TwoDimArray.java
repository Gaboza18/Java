package arrays;

public class TwoDimArray {

	public static void main(String[] args) {

		int[][] score = new int[3][3]; // [],[] = ���Ǽ�,���Ǽ�

		score[0][0] = 78;
		score[0][1] = 85;
		score[0][2] = 90;

		// 2���� �迭�� �ʱ�ȭ
		int point[][] = { 
				{ 95, 90, 88 }, 
				{ 78, 67, 89 },
				{ 90, 39, 58 }, 
				};

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[i].length; j++) {
				System.out.print(point[i][j] + " ");
			}
			System.out.println();
		}

	}

}
