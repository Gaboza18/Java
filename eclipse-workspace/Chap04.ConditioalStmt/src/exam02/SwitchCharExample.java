package exam02;

public class SwitchCharExample {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); System.out.print("ȸ���� Ȯ���� ����� �Է��ϼ���: ");
		 * char member_grade = input.nextInt(); // ȸ���� ���: 'S,s' = �ֿ�� ȸ��, 'A,a' = ��� ȸ��, 'B,b' = �Ϲ� ȸ��
		 */

		char member_grade = 'S'; // ȸ���� ���: 'S,s' = �ֿ�� ȸ��, 'A,a' = ��� ȸ��, 'B,b' = �Ϲ� ȸ��

		switch (member_grade) {
		case 'S':
		case 's':
			System.out.println("�ֿ�� ȸ���Դϴ�.");
			break;

		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;

		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;

		default:
			System.out.println("�մ� �Դϴ�.");

		}

	}

}
