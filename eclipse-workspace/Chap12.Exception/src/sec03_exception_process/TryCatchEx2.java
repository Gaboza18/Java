package sec03_exception_process;

public class TryCatchEx2 {

	public static void main(String[] args) {
		/*
		 * 예외발생시 try-catch 실행 흐름
		 */
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0); // 문제발생 
			System.out.println(4); // 예외가 발생하면 실행하지 않고 넘어간다 
		} catch (Exception e) {
			System.out.println(5); // 예외발생한 부분에서 처리가 된다.
		}
		System.out.println(6);
	}

}
