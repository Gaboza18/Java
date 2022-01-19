package sec02_ReaderWriter;

import java.io.*;

public class FileReaderEx1Practice {

	public static void main(String[] args) {

		try {

			String fileName1 = "test.hangul";
			FileInputStream fis = new FileInputStream(fileName1);
			FileReader fr = new FileReader(fileName1);

			int data = 0;

			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
			fis.close();

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
