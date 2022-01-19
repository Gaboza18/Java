package exercise;

public class ArrayEx1 { // 랜덤 10개 숫자를 배열에 저장하여 출력하는 예제

	public static void main(String[] args) {

		int[] arrayNumber = new int[10];
		int max = 0; // 최댓값 저장
		int min = 0;

		System.out.print("배열: ");
		for (int i = 0; i < arrayNumber.length; i++) {
			arrayNumber[i] = (int) (Math.random() * 100) + 1;

			if (max < arrayNumber[i]) {
				max = arrayNumber[i];
			} else if (min > arrayNumber[i]) { // 최솟값 안나옴 해결 필요
				min = arrayNumber[i];
			}
			System.out.print(arrayNumber[i] + " ");
		}
		System.out.println("\n배열 최대값: " + max);
		System.out.println("배열 최대값: " + min);
	}
}
