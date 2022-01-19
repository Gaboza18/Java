package sec05_Inputstreamreader;

import java.io.*;

public class OutstreamWriterEx { // test.hangul 파일을 읽어서 콘솔창 출력하는 예제

	public static void main(String[] args) {

		FileInputStream fis = null;
		InputStreamReader isr = null; // 바이트 입력 -> 문자입력
		OutputStreamWriter osw = null; // 문자 출력 -> 바이트 출력

		try {
			fis = new FileInputStream("test.hangul");
			isr = new InputStreamReader(fis);
			osw = new OutputStreamWriter(System.out);

			char[] cbuf = new char[512]; // 읽어들인 내용 임시저장.
			int cnt = 0; // 읽어들인 문자수 저장 변수
			while ((cnt = isr.read(cbuf)) != -1) { // 문서의 끝 읽을게 없을때 -1 리턴
				osw.write(cbuf, 0, cnt); // 버퍼의 내용을 첫번째 위치부터 cnt개수만큼 출력
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				isr.close();
				osw.close();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

}
