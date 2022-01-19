package sec01_inputstreamOutputstream;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("test.txt");
			fos = new FileOutputStream("test.out");

			int data = 0; // 스트림에서 읽은 데이터 저장
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

		} catch (IOException e) { // 모든 예외처리 수행
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
