package sec04_file_class;

import java.io.*;

public class FileEx1 {

	public static void main(String[] args) throws IOException {

		File file = new File("./program.out");

		String fileName = file.getName();

		System.out.println("��θ� ������ ���ϸ�: " + fileName);

		String path = file.getPath();
		System.out.println("��θ� ������ ���ϸ�: " + path);

		System.out.println("������ ������: " + file.getAbsolutePath());
		System.out.println("������ ���԰��: " + file.getCanonicalPath());
	}

}
