package arrays;

public class VariableArray { // ���� �迭 ����
	public static void main(String args[]) {

		// ���� �迭 ����
		int[][] scores = new int[5][]; // ���� ���� �������� ����.

		// �� �ະ�� �����͸� ����� ���� ������ ����
		scores[0] = new int[4];
		scores[1] = new int[3];
		scores[2] = new int[2];
		scores[3] = new int[3];
		scores[4] = new int[3];

		scores[0][0] = 87;
		scores[0][1] = 90;
	 // scores[0][4] = 87; �ε��� ���� ������ ����� �����߻�

		// ���� �迭 �ʱ�ȭ

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
