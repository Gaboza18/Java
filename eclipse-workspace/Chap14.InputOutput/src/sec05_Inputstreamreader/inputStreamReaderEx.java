package sec05_Inputstreamreader;

import java.io.*;

public class inputStreamReaderEx {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;

		// ����Ʈ �Էµ����͸� ���ڵ����ͷ� ��ȯ�ϴ� ��Ʈ��
		InputStreamReader isr = new InputStreamReader(is);

		// ������ ������ �Ѳ����� ó���ϴ� ���� ��Ʈ��
		BufferedReader br = new BufferedReader(isr);
		String line = "";

		System.out.println("������� ���ڵ� ���: " + isr.getEncoding());

		int data = 0;
		/*
		 * char[] cbuf = new char[100]; while ((data = isr.read(cbuf)) != -1) { String
		 * result = new String(cbuf, 0, data); System.out.println(result); }
		 */
		do {
			System.out.print("������ �Է�(����: q): ");
			line = br.readLine();
			System.out.println("�Է��� ����: " + line);
		} while (!line.equalsIgnoreCase("q")); // �빮�� �ҹ��� ������� �����Է��ϸ� �ݺ��� Ż���Ѵ�

		br.close();
		System.out.println("���α׷� ����");
	}

}
