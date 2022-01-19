package sec05_Inputstreamreader;

import java.io.*;

public class InputStreamReaderExample {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		
		// 바이트 입력데이터를 문자데이터로 변환하는 스트림
		Reader reader = new InputStreamReader(is);

		int readCharNO;
		char[] cbuf = new char[100];

		while ((readCharNO = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNO);
			System.out.println(data);
		}
		reader.close();
	}

}
