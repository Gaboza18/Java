package sec03_exception_process;

public class TryCatchEx1 {

	public static void main(String[] args) {
		/*
		 * 정상적인 try-catch 실행 흐름
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
