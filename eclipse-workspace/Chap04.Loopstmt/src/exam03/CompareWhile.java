package exam03;

import java.io.IOException;

public class CompareWhile { // Do-While문 에서 While문으로 전환

	public static void main(String[] args) throws IOException {

		int input = 0; // 키보드에서 입력한 글자를 코드로 저장

		System.out.println("문장을 입력하세요");
		System.out.println("입력을 마칠려면 x를 입력하세요");

		input = System.in.read();
		while (input != 'x') { // x가 아니면 반복한다.
			System.out.print((char) input);
			input = System.in.read(); // 키보드로 입력받는구간

		}
	}

}
