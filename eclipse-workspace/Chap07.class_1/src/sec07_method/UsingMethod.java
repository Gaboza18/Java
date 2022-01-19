package sec07_method;

public class UsingMethod { // 메소드

	public static void main(String[] args) {

		int[] arr1 = { 30, 34, 35, 299, 55 };

		// 배열의 초기값을 출력
		
		/*
		 * System.out.print("배열의 초기값: "); 
		 * for (int i = 0; i < arr1.length; i++) {
		 * System.out.printf(arr1[i] + " "); 
		 * } System.out.println();
		 */
		
		displayArray(arr1);

		arr1[1] = 99; // [1] 배열 내용 바꾼다
		displayArray(arr1);
		/*
		 * for (int i = 0; i < arr1.length; i++) { System.out.printf(arr1[i] + " "); }
		 * System.out.println();
		 */
		int temp = arr1[1]; // 1번,2번 배열 내용 서로바꾼다
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
	 * 배열의 내용을 출력하는 기능을 수행
	 */
	public static void displayArray(int[] intArr) { //	displayArray(arr1);
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf(intArr[i] + " ");
		}
		System.out.println();
	}
}