package sec05_throws;

public class ThrowsEx { // 예외 떠넘기기

	public static void main(String[] args) {

		try {
			searchClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			// e.printStackTrace();
		}
	}

	// 이 메소드에서 예외를 처리하지 않고 호출한 메소드로 예외를 넘긴다
	public static void searchClass() throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String2"); // 없는 클래스를 지정하여 예외발생시킴
	}
}
