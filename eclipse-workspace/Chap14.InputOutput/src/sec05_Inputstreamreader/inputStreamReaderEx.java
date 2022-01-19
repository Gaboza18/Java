package sec05_Inputstreamreader;

import java.io.*;

public class inputStreamReaderEx {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;

		// 바이트 입력데이터를 문자데이터로 변환하는 스트림
		InputStreamReader isr = new InputStreamReader(is);

		// 문자의 집합을 한꺼번에 처리하는 보조 스트림
		BufferedReader br = new BufferedReader(isr);
		String line = "";

		System.out.println("사용중인 인코딩 방식: " + isr.getEncoding());

		int data = 0;
		/*
		 * char[] cbuf = new char[100]; while ((data = isr.read(cbuf)) != -1) { String
		 * result = new String(cbuf, 0, data); System.out.println(result); }
		 */
		do {
			System.out.print("문장을 입력(종료: q): ");
			line = br.readLine();
			System.out.println("입력한 문장: " + line);
		} while (!line.equalsIgnoreCase("q")); // 대문자 소문자 상관없이 조건입력하면 반복문 탈출한다

		br.close();
		System.out.println("프로그램 종료");
	}

}
