package sec03_system_in_out;

import java.io.*;

public class SystemOutEx {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out; // 표준출력(콘솔)으로 출력스트림 지정

		for (byte b = 48; b < 58; b++) { // 숫자 출력
			os.write(b);
		}
		os.write(10); // newline의 의미

		for (byte b = 97; b < 123; b++) { // 영문 소문자 출력
			os.write(b);
		}

		os.write(10); // 한줄띄운다

		String hangul = "가나다라마바사아자차카타파하"; // 한글을 표준출력으로 내보내기
		byte[] hangulBytes = hangul.getBytes(); // 한글을 byte배열에 저장
		os.write(hangulBytes);

		os.flush(); // 스트림에 남아 있는 데이터를 표준출력으로 내보내는 기능
		os.close();
	}

}
