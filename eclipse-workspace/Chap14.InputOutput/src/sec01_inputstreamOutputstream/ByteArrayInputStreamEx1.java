package sec01_inputstreamOutputstream;

import java.io.*; // ����½� ����Ʈ
import java.util.Arrays;

public class ByteArrayInputStreamEx1 {

	public static void main(String[] args) {

		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // �Է¿� �迭
		byte[] outSrc = null; // ��¿� �迭

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		int data = 0; // ��Ʈ������ ���� ������ ����

		while ((data = input.read()) != -1) { // �޸𸮿��� ���̻� ���� �����Ͱ� ������ -1�� �����Ѵ�
			output.write(data); // ��½�Ʈ�� ���� ���� �����͸� ��������.
		}
		outSrc = output.toByteArray(); // ��� ��Ʈ���� ������ byte�迭�� ��ȯ�Ͽ� ����
		System.out.println("Input Source: " + Arrays.toString(inSrc)); // �迭���·� ��ȯ�Ͽ� ���
		System.out.println("Output Source: " + Arrays.toString(outSrc));
	}

}
