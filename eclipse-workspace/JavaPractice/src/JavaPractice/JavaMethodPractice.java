package JavaPractice;

import java.util.Scanner;
/*
public class JavaMethodPractice {
	public static void numbering() { // numbering Method 선언
		Scanner sc = new Scanner(System.in);

		int number = 0;
		while (number < 10) {
			System.out.println(number);
			number++;

		}

	}

	public static void main(String[] args) {
	 	numbering(); // numbering Method 호출
	}
}
*/
/*
public class JavaMethodPractice {
	public static void numbering(int limit) { // int limit = n; 동일한 의미
		int number = 0;
		while (number < limit) {
			System.out.println(number);
			number++;

		}
	}

	public static void main(String[] args) {
		numbering(5); // int limit
	}
}
*/
/*
public class JavaMethodPractice {
	public static void numbering(int init, int limit) {
		int number = init;
		while (number < limit) {
			System.out.println(number);
			number++;
		}
	}

	public static void main(String[] args) {
		numbering(2, 5); //(int init, int limit)

	}
}
*/
/*
public class JavaMethodPractice {
	public static String numbering(int init, int limit) {
		int number = init;
		String output = ""; // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
		
		while(number<limit) { // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
			output +=number; //output = output+i;
			number++;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(2, 5);
		System.out.println(result);

	}
}
*/

public class JavaMethodPractice {
	public static String[] getMembers() {
		String[] members = { "홍길동, 홍길순, 홍길서" };
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
	}
}