package exercise;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");

		int mark = input.nextInt();

		if (mark % 2 == 0) {
			System.out.println("�Է��Ͻ� ������ '¦��' �Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ������ 'Ȧ��' �Դϴ�.");
		}
		System.out.println("bye!");
	}
}