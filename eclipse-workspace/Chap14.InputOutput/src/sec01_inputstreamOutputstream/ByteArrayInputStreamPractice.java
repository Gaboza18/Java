package sec01_inputstreamOutputstream;

import java.io.*;
import java.util.Arrays;

public class ByteArrayInputStreamPractice {

	public static void main(String[] args) {

		byte[] InSrc = { 0, 1, 2, 3, 4, 5 }; // �Է¿� �迭 
		byte[] OutSrc = null; // ��¿� �迭(�Է¹����� ����ؾ� �ϱ� ������ null)

		ByteArrayInputStream input = new ByteArrayInputStream(InSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		int data = 0; // ��Ʈ������ ���� ������ ����

		while ((data = input.read()) != -1) { // �޿������� ���̻� ���� �����Ͱ� ������ -1 �����Ѵ�
			output.write(data);
		}

		OutSrc = output.toByteArray();
		System.out.println("Input Source: " + Arrays.toString(InSrc));
		System.out.println("Output Source: " + Arrays.toString(OutSrc));
	}

}
