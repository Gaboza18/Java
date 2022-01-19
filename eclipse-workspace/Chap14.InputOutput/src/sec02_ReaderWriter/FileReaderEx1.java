package sec02_ReaderWriter;

import java.io.*;

public class FileReaderEx1 { // test.txt 파일을 읽어온다

	public static void main(String[] args) {

		try {
			// String fileName = "test.txt";
			String fileName1 = "test.hangul";
			FileInputStream fis = new FileInputStream(fileName1); // 한글 입력시 문제 생긴다(InputStream)
			FileReader fr = new FileReader(fileName1); // 한글입력 문제 해결 solution

			int data = 0;

			// inputstream을 통해 데이터 읽기
			while ((data = fis.read()) != -1) {
				System.out.print((char) data); // 데이터를 문자로 출력하기 위해 형변환(int -> char)
			}
			System.out.println();
			fis.close();

			// reader를 통해서 데이터 읽기
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
