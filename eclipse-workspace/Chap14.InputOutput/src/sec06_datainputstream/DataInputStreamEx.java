package sec06_datainputstream;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("sample.data");
			DataInputStream dis = new DataInputStream(fis); // ������ Ÿ�Ժ��� ���� ��Ʈ��

			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());

			dis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
