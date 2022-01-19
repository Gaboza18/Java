package sec05_Inputstreamreader;

import java.io.*;

public class ISRExPractice {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;

		InputStreamReader isr = new InputStreamReader(is);

		BufferedReader br = new BufferedReader(isr);
		String line = "";

		System.out.println("사용중인 인코딩 방식: " + isr.getEncoding());

		int data = 0;

		do {
			System.out.println("문장을 입력(종료: q): ");
			line = br.readLine();
			System.out.println("입력한 문장: " + line);
		} while (!line.equals("q"));

		br.close();
		System.out.println("프로그램 종료");
	}

}
