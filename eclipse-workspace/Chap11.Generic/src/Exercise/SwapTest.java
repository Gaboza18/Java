package Exercise;

public class SwapTest {
	public static <T> void swap(T first, T second) {
		
		T temp = first; // 첫번째 값을 temp로 이동
		first = second; // 두번째 값을 첫번쨰 값에 넣는다
		second = temp; // 두번째 값을 temp에서 이동 하여 순서를 바꿈

		System.out.println("(a,b)=(" + first + "," + second + ")");
	}

	public static void main(String[] args) {
		swap(Integer.valueOf(1), Integer.valueOf(2));
		swap("hi", "bye");
	}

}
