package sec01_runtime_exception;

public class ArrayIndex {

	public static void main(String[] args) {

		int[] intArr = { 10, 20, 30, 40, 50 };

		// 배열의 index 범위를 벗어난 인덱스 사용시 에러
		System.out.println(intArr[5]); // 수정:[0~4]

	}

}
