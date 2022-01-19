package sec01_inputstreamOutputstream;

import java.io.*;

public class FileCopyPractice {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			
			fis = new FileInputStream("test2.txt");
			fos = new FileOutputStream("test2.out");

			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

		} catch (IOException e) {
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
