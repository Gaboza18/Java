package exam02;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {

		int user_type;
		user_type = 1; // 0: �Ϲ� ����� 1: ������ 2: �մ�

		/*
		 * Scanner input = new Scanner(System.in); System.out.print("�α����� �ڵ带 �Է��ϼ���: ");
		 * int user_type = input.nextInt(); // 0: �Ϲ� ����� 1: ������ 2: �մ�
		 */

		switch (user_type) { // ������ �Է�
		case 0: // user_type�� '0' �ϰ��
			System.out.println("�Ϲ� ����� �Դϴ�.");
			break;
		case 1: // user_type�� '1' �ϰ��
			System.out.println("������ �Դϴ�.");
			break;
		case 2: // user_type�� '2' �ϰ��
			System.out.println("�մ� �Դϴ�.");
			break;
		default: // user_type�� '0~1' �̿� �ϰ��
			System.out.println("�߸��� ����� �Դϴ�.");
		}
	}
}
