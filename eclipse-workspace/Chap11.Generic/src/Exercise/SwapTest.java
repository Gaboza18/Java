package Exercise;

public class SwapTest {
	public static <T> void swap(T first, T second) {
		
		T temp = first; // ù��° ���� temp�� �̵�
		first = second; // �ι�° ���� ù���� ���� �ִ´�
		second = temp; // �ι�° ���� temp���� �̵� �Ͽ� ������ �ٲ�

		System.out.println("(a,b)=(" + first + "," + second + ")");
	}

	public static void main(String[] args) {
		swap(Integer.valueOf(1), Integer.valueOf(2));
		swap("hi", "bye");
	}

}
