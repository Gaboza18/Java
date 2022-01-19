package sec05_Inputstreamreader;

import java.io.*;

public class InputStreamReaderExample {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		
		// ����Ʈ �Էµ����͸� ���ڵ����ͷ� ��ȯ�ϴ� ��Ʈ��
		Reader reader = new InputStreamReader(is);

		int readCharNO;
		char[] cbuf = new char[100];

		while ((readCharNO = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNO);
			System.out.println(data);
		}
		reader.close();
	}

}
