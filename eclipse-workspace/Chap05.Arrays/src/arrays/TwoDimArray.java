package arrays;

public class TwoDimArray {

	public static void main(String[] args) {

		int[][] score = new int[3][3]; // [],[] = 행의수,열의수

		score[0][0] = 78;
		score[0][1] = 85;
		score[0][2] = 90;

		// 2차원 배열의 초기화
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
