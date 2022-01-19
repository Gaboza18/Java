package exam03;

import java.io.IOException; //예외처리

public class DoWhileExample1 { //x를 입력할때 까지 반복 수행
	public static void main(String[] args) throws IOException {

		int input = 0; // 키보드에서 입력한 글자를 코드로 저장

		System.out.println("문장을 입력하세요");
		System.out.println("입력을 마칠려면 x를 입력하세요");

		do {
			input = System.in.read(); // 키보드에서 한글자씩 입력 받는다.
			System.out.print((char) input);
		} while (input != 'x'); // x를 입력하면 탈출한다.
	}
}
