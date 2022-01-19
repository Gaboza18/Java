package sec03_system_in_out;

import java.io.*;

public class SystemInEx {

	public static void main(String[] args) {

		System.out.println("===메뉴===");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 입금");
		System.out.println("3. 예금 출금");
		System.out.println("4. 프로그램 종료");
		System.out.println("=========");
		System.out.print("메뉴선택: ");

		InputStream is = System.in; // 표준입력장치(콘솔)를 입력스트림으로 사용

		try {
			char input = (char) is.read(); // int -> char 형변환

			switch (input) {
			case '1':
				System.out.println("'예금 조회'를 선택하였습니다.");
				break;
			case '2':
				System.out.println("'예금 입금'을 선택하였습니다.");
				break;
			case '3':
				System.out.println("'예금 출금'을 선택하였습니다.");
				break;
			case '4':
				System.out.println("'프로그램 종료' 선택하였습니다.");
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
