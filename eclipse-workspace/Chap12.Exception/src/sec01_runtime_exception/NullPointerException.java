package sec01_runtime_exception;

public class NullPointerException {

	public static void main(String[] args) {

		String data = null; // 저장소가 할당되어 있지 않음
		// 해결방법 //
		// data = new String("java"); // 저장소 할당
		System.out.println(data.toString()); // 객체에 주소가 할당되지 않음

	}

}
