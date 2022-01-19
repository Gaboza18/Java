package sec03_system_in_out;

import java.io.*;

public class SystemOutEx {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out; // ǥ�����(�ܼ�)���� ��½�Ʈ�� ����

		for (byte b = 48; b < 58; b++) { // ���� ���
			os.write(b);
		}
		os.write(10); // newline�� �ǹ�

		for (byte b = 97; b < 123; b++) { // ���� �ҹ��� ���
			os.write(b);
		}

		os.write(10); // ���ٶ���

		String hangul = "�����ٶ󸶹ٻ������īŸ����"; // �ѱ��� ǥ��������� ��������
		byte[] hangulBytes = hangul.getBytes(); // �ѱ��� byte�迭�� ����
		os.write(hangulBytes);

		os.flush(); // ��Ʈ���� ���� �ִ� �����͸� ǥ��������� �������� ���
		os.close();
	}

}
