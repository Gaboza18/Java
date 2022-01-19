package sec06_datainputstream;

import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("sample.data");
			dos = new DataOutputStream(fos); // �ܵ����� ��� �Ұ���

			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeBoolean(true);

			dos.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
}