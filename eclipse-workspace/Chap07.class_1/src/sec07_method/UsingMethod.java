package sec07_method;

public class UsingMethod { // �޼ҵ�

	public static void main(String[] args) {

		int[] arr1 = { 30, 34, 35, 299, 55 };

		// �迭�� �ʱⰪ�� ���
		
		/*
		 * System.out.print("�迭�� �ʱⰪ: "); 
		 * for (int i = 0; i < arr1.length; i++) {
		 * System.out.printf(arr1[i] + " "); 
		 * } System.out.println();
		 */
		
		displayArray(arr1);

		arr1[1] = 99; // [1] �迭 ���� �ٲ۴�
		displayArray(arr1);
		/*
		 * for (int i = 0; i < arr1.length; i++) { System.out.printf(arr1[i] + " "); }
		 * System.out.println();
		 */
		int temp = arr1[1]; // 1��,2�� �迭 ���� ���ιٲ۴�
		arr1[1] = arr1[2];
		arr1[2] = temp;
		/*
		 * for (int i = 0; i < arr1.length; i++) { System.out.printf(arr1[i] + " ");
		 * 
		 * } System.out.println();
		 */
		displayArray(arr1);
	}

	/*
	 * �迭�� ������ ����ϴ� ����� ����
	 */
	public static void displayArray(int[] intArr) { //	displayArray(arr1);
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf(intArr[i] + " ");
		}
		System.out.println();
	}
}