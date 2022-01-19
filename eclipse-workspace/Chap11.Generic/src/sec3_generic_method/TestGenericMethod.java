package sec3_generic_method;

// Generic Method 구현 
// 배열의 내용을 출력하는 메소드	
public class TestGenericMethod {
	public static <E> void printArray(E[] arr) {
		for (E element : arr) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArr = { 30, 50, 60, 20, 70 };
		Character[] charArr = { 'J', 'A', 'V', 'A' };

		printArray(intArr);
		printArray(charArr);

	}

}
