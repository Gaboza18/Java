package sec03_exception_process;

public class TryCatchEx1 {

	public static void main(String[] args) {
		/*
		 * �������� try-catch ���� �帧
		 */
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
