package arrays;

public class VariableArray { // 가변 배열 예제
	public static void main(String args[]) {

		// 가변 배열 선언
		int[][] scores = new int[5][]; // 열의 수를 지정하지 않음.

		// 각 행별로 데이터를 저장시 열의 갯수를 지정
		scores[0] = new int[4];
		scores[1] = new int[3];
		scores[2] = new int[2];
		scores[3] = new int[3];
		scores[4] = new int[3];

		scores[0][0] = 87;
		scores[0][1] = 90;
	 // scores[0][4] = 87; 인덱스 지정 범위를 벗어나면 오류발생

		// 가변 배열 초기화

		int[][] vArr = { 
				{ 87, 90, 68}, 
				{ 90, 68}, 
				{ 76, 78, 56, 89 }
		   };

			for (int n = 0; n < vArr.length; n++) {
				for (int m = 0; m < vArr[n].length; m++) {
					System.out.print(vArr[n][m] + " ");
				}
				System.out.println();
			}
		}
	}
