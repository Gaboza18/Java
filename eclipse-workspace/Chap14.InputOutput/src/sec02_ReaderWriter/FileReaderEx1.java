package sec02_ReaderWriter;

import java.io.*;

public class FileReaderEx1 { // test.txt ������ �о�´�

	public static void main(String[] args) {

		try {
			// String fileName = "test.txt";
			String fileName1 = "test.hangul";
			FileInputStream fis = new FileInputStream(fileName1); // �ѱ� �Է½� ���� �����(InputStream)
			FileReader fr = new FileReader(fileName1); // �ѱ��Է� ���� �ذ� solution

			int data = 0;

			// inputstream�� ���� ������ �б�
			while ((data = fis.read()) != -1) {
				System.out.print((char) data); // �����͸� ���ڷ� ����ϱ� ���� ����ȯ(int -> char)
			}
			System.out.println();
			fis.close();

			// reader�� ���ؼ� ������ �б�
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
