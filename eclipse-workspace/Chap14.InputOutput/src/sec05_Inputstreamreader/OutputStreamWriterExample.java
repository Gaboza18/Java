package sec05_Inputstreamreader;

import java.io.*;

public class OutputStreamWriterExample {  

	/*
	 * OutputStreamWriter는 바이트 출력스트림에 연결되어 문자 출력 스트림인
	 * Writer로 변환시키는 보조 스트림
	 */
	
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("file.txt");

		Writer writer = new OutputStreamWriter(fos);

		String data = "이파일은 OutputStreamWriter 테스트 하기 위한 파일입니다.";
		writer.write(data);

		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");

	}

}
