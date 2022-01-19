package sec01_inputstreamOutputstream;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("test.txt");
			fos = new FileOutputStream("test.out");

			int data = 0; // ��Ʈ������ ���� ������ ����
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

		} catch (IOException e) { // ��� ����ó�� ����
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
