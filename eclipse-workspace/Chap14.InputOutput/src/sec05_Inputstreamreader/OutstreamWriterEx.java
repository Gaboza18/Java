package sec05_Inputstreamreader;

import java.io.*;

public class OutstreamWriterEx { // test.hangul ������ �о �ܼ�â ����ϴ� ����

	public static void main(String[] args) {

		FileInputStream fis = null;
		InputStreamReader isr = null; // ����Ʈ �Է� -> �����Է�
		OutputStreamWriter osw = null; // ���� ��� -> ����Ʈ ���

		try {
			fis = new FileInputStream("test.hangul");
			isr = new InputStreamReader(fis);
			osw = new OutputStreamWriter(System.out);

			char[] cbuf = new char[512]; // �о���� ���� �ӽ�����.
			int cnt = 0; // �о���� ���ڼ� ���� ����
			while ((cnt = isr.read(cbuf)) != -1) { // ������ �� ������ ������ -1 ����
				osw.write(cbuf, 0, cnt); // ������ ������ ù��° ��ġ���� cnt������ŭ ���
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				isr.close();
				osw.close();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

}
