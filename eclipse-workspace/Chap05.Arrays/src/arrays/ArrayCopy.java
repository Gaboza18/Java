package arrays;

public class ArrayCopy {

	public static void main(String[] args) { //arraycopy

		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] number = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		System.out.println(abc);
		System.out.println(number);

		// abc, number의 요소 갯수를 합한 배열을 생성
		char[] result = new char[abc.length + number.length];

		// abc, number배열의 내용을 result에 복사
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(number, 0, result, abc.length, number.length);
		System.out.println(result);
	}

}