package sec03_system_in_out;

import java.io.*;

public class SystemInEx {

	public static void main(String[] args) {

		System.out.println("===�޴�===");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� �Ա�");
		System.out.println("3. ���� ���");
		System.out.println("4. ���α׷� ����");
		System.out.println("=========");
		System.out.print("�޴�����: ");

		InputStream is = System.in; // ǥ���Է���ġ(�ܼ�)�� �Է½�Ʈ������ ���

		try {
			char input = (char) is.read(); // int -> char ����ȯ

			switch (input) {
			case '1':
				System.out.println("'���� ��ȸ'�� �����Ͽ����ϴ�.");
				break;
			case '2':
				System.out.println("'���� �Ա�'�� �����Ͽ����ϴ�.");
				break;
			case '3':
				System.out.println("'���� ���'�� �����Ͽ����ϴ�.");
				break;
			case '4':
				System.out.println("'���α׷� ����' �����Ͽ����ϴ�.");
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
