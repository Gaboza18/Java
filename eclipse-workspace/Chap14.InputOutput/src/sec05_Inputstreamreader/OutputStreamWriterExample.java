package sec05_Inputstreamreader;

import java.io.*;

public class OutputStreamWriterExample {  

	/*
	 * OutputStreamWriter�� ����Ʈ ��½�Ʈ���� ����Ǿ� ���� ��� ��Ʈ����
	 * Writer�� ��ȯ��Ű�� ���� ��Ʈ��
	 */
	
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("file.txt");

		Writer writer = new OutputStreamWriter(fos);

		String data = "�������� OutputStreamWriter �׽�Ʈ �ϱ� ���� �����Դϴ�.";
		writer.write(data);

		writer.flush();
		writer.close();
		System.out.println("���� ������ �������ϴ�.");

	}

}
