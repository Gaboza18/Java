package sec04_file_class;

import java.io.*;

/*
 *  ����� ������Ʈ���� ���丮���� �Է��ϸ�
 *  ���丮 ���θ� �Ǵ��ϴ� ���α׷�
 */
public class FileEx2 { // Run - RunConfigurations ����

	public static void main(String[] args) {

		File file = new File(args[0]); // ����࿡�� �Է°��� �о���δ�.
		System.out.println("�Է� ���丮��: " + args[0]);

		// ���丮���� �������� �ʰų�, ���丮�� �ƴϸ� ���α׷� ���� ����
		if (!file.exists() || !file.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
			System.exit(0); // ���α׷� ����
		} else {
			System.out.println("�����ϴ� ���丮 �Դϴ�.");
			System.out.println();
		}

		File[] files = file.listFiles();
		System.out.println("======���� ���======");
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}

}
