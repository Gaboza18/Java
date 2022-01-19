package Sec02;

public class CharExample {

	public static void main(String[] args) { // char 타입은 하나의 문자를 저장하는 타입

		char c1 = 'A';
		int code = c1; // A = 65 아스키 코드값
		char c2 = '가'; // 가 = 44032 유니 코드값
		int code2 = c2;
		char c3 = '\uac00'; // 유니코드로 저장

		System.out.println("c1 = " + c1);
		System.out.println("c1 = " + code);
		System.out.println("c2 = " + c2);
		System.out.println("c1 = " + code2);
		System.out.println("c3 = " + c3);
	}

}
