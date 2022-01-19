package sec01_runtime_exception;

public class NumberFormatException {

	public static void main(String[] args) {

		// 문자에서 숫자로 변환하려고 함
		String data1 = "123"; // 문자열
		String data2 = "a123"; // 문자열

		int value = Integer.parseInt(data1); // 문자열 -> 숫자
		int value2 = Integer.parseInt(data2); // data2 값: 숫자에 문자가 섞여있음 변환불가
	}

}
